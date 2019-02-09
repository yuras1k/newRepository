package Order;
import Product.*;
import Consumer.*;

import java.util.Arrays;


public class Order {



    private int idOrder;
    private Consumer consumerInOrder;
    private Product listProductInOrder[];
    private String statusOrder;

    public Order(int idOrder, Consumer consumerInOrder, Product[] listProductInOrder, String statusOrder) {
        this.idOrder = idOrder;
        this.consumerInOrder = consumerInOrder;
        this.listProductInOrder = listProductInOrder;
        this.statusOrder = statusOrder;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Consumer getConsumerInOrder() {
        return consumerInOrder;
    }

    public Product[] getListProductInOrder() {
        return listProductInOrder;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }



    @Override
    public String toString() {
        return "" +". ID номер покупателя: " +   consumerInOrder.getIdConsumer() + ". Полное имя покупателя: " + consumerInOrder.getName()+ ". Адрес покупателя: " + consumerInOrder.getAddress()+  ".\nСписок заказанных товаров: " + Arrays.toString(listProductInOrder) + "\nСтатус заказа: " + statusOrder;
    }
}
