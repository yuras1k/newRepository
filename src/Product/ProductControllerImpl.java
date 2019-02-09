package Product;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import java.util.*;
import java.util.stream.Stream;


public class ProductControllerImpl implements ProductController {

    public static Map<Integer, Product> mapProduct = new HashMap<Integer, Product>();




    public void createProduct(Product product) {


        int maxKeyID = 0;
        for (int key: mapProduct.keySet()) {
                 if(maxKeyID <= key) {

                     maxKeyID = key;

                 }

        }

            product.setIdProduct(maxKeyID+1);
            mapProduct.put((maxKeyID+1), product);


    }


    public void getListProduct() {

        for (Map.Entry entry : mapProduct.entrySet()) {
            System.out.println("ID: "+entry.getKey() + ", " + entry.getValue());
        }
        System.out.println();

    }


    public void editingProduct(int id, Product product) {


           for (int key: mapProduct.keySet()) {
            if (key == id) {

                mapProduct.put(id,product);
                System.out.println("Замена произошла умпешно. Ниже результат.");
                break;

            }

        }

    }


    public void removeProduct(int a) {



        for (int key: mapProduct.keySet()) {
            if (key == a) {

                mapProduct.remove(a);
                System.out.println("Удаление произошло умпешно. Ниже результат.");
                break;

            }


        }

    }

}


  /*      Map<String, Product> sortedMap = new TreeMap<String, Product>(String.CASE_INSENSITIVE_ORDER);
        sortedMap.putAll(mapProduct);

        System.out.println(sortedMap);
*/