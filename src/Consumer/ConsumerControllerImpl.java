package Consumer;

import java.util.HashMap;
import java.util.Map;

public class ConsumerControllerImpl implements ConsumerController {

    private Map<Integer, Consumer> mapConsumer = new HashMap<Integer, Consumer>();


    public void createConsumer(Consumer consumer) {


        int maxKeyID = 0;
        for (int key: mapConsumer.keySet()) {
            if(maxKeyID <= key) {

                maxKeyID = key;

            }

        }

        consumer.setIdConsumer(maxKeyID+1);
        mapConsumer.put((maxKeyID+1), consumer);

    }


    public void getListConsumer() {

        for (Map.Entry entry : mapConsumer.entrySet()) {
            System.out.println("ID: "+entry.getKey() + ", " + entry.getValue());
        }
        System.out.println();

    }

}
