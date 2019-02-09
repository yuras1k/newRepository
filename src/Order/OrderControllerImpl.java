package Order;
import Product.*;
import Consumer.*;

import java.util.HashMap;
import java.util.Map;

public class OrderControllerImpl implements OrderController {

    private Map<Integer, Order> mapOrder = new HashMap<Integer, Order>();


    public void ctreateOrder(Order order) {

        int maxKeyID = 0;
        for (int key: mapOrder.keySet()) {
            if(maxKeyID <= key) {

                maxKeyID = key;

            }

        }

        order.setStatusOrder("Accepted");
        order.setIdOrder(maxKeyID+1);
        mapOrder.put((maxKeyID+1), order);

    }


    public void getListOrder() {

        for (Map.Entry entry : mapOrder.entrySet()) {
            System.out.println("ID номер заказа: "+entry.getKey()  + entry.getValue());
        }
        System.out.println();

    }

    public void editingStatusOrder(int idOrder) {

        for (int key: mapOrder.keySet()) {
            if (key == idOrder) {

                mapOrder.get(idOrder).setStatusOrder("Ready");
                mapOrder.put(idOrder,mapOrder.get(idOrder));
                System.out.println("Замена статуса произошла умпешно. Ниже результат.");
                break;

            }

        }



    }



}
