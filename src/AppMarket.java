import Product.*;
import Consumer.*;
import Order.*;
import static Product.ProductControllerImpl.*;

public class AppMarket {

    public static String ANSI_BLACK = "\u001B[30m"; //Устанавливаем цвет
    public static String ANSI_PURPLE = "\u001B[34m"; //Устанавливаем цвет


    public static void main(String[] args) {


        ProductController pc = new ProductControllerImpl();

        int randomID = 0;

        System.out.println(ANSI_PURPLE+"Создание/добавление продукции. Выводим на печать."+ANSI_BLACK);
        //Создаём список товаров (в идеале список должен подтягивать из БД). Id продукта ставлю по умолчанию 0 или любой, в конечном итоге программа присвоит id в методе (любой свободный по порядку).
       Product product1 = new Product(randomID,"Amortizator MB W210", 500);
       Product product2 = new Product(randomID,"Amortizator MB W124", 600);
       Product product3 = new Product(randomID,"Amortizator MB W126", 400);


       // Добавляем продукцию
       pc.createProduct(product1);
       pc.createProduct(product2);
       pc.createProduct(product3);

        // Выводим на печать весь перечень продукции
        pc.getListProduct();

        System.out.println(ANSI_PURPLE+"Удаление продукции по ID номеру. Выводим на печать. Если мы не верно укажем ID номер (не совпадает с уже существующими, то ничего не произойдёт)"+ANSI_BLACK);
        // Удаляем продукцию по ID номеру
        pc.removeProduct(2);
        pc.getListProduct();


        //Редактирование продукции, выбранной по ID номеру
        System.out.println(ANSI_PURPLE+"Редактирование продукции, выбранной по ID номеру. Выводим на печать. Если мы не верно укажем ID номер (не совпадает с уже существующими, то ничего не произойдёт)"+ANSI_BLACK);
        Product product4 = new Product(1,"AirBack MB W126", 300);
        pc.editingProduct(product4.getIdProduct(), product4);
        pc.getListProduct();


        //Создаем новую продукцию без учёта ID номера
        System.out.println(ANSI_PURPLE+"Создание/добавление продукции. Выводим на печать."+ANSI_BLACK);
        Product product5 = new Product(randomID,"BrakeSupport Audi A8", 700);
        pc.createProduct(product5);
        pc.getListProduct();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////


        ConsumerController cc = new ConsumerControllerImpl();

        System.out.println(ANSI_PURPLE+"Создание/добавление клиента. Выводим на печать."+ANSI_BLACK);
        //Создаём список покупателей/клиентов. Id покупателя ставлю по умолчанию 0 или любой, в конечном итоге программа присвоит id в методе (любой свободный по порядку).
        Consumer consumer1 = new Consumer(randomID, "Vladimir Gorelko", "Jukovskogo 9/1");
        Consumer consumer2 = new Consumer(randomID, "Yuri Chernishev", "Jukovskogo 9/2");

        cc.createConsumer(consumer1);
        cc.createConsumer(consumer2);

        cc.getListConsumer();


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(ANSI_PURPLE+"Создание/добавление заказа. Выводим на печать."+ANSI_BLACK);

        OrderController oc = new OrderControllerImpl();
        String status = null; //Статус по умолчанию ставим null, он будет при создании заказа сам присваеиваться (Accepted)

        //Создаем заказ, так как клиент может заказать несколько единиц продукции, продукцию заказанную клиентом, помещаем в массив.


        Product arrProduct1[] = {mapProduct.get(1), mapProduct.get(4)};


        Order order1 = new Order(randomID,  consumer1, arrProduct1, status );

        oc.ctreateOrder(order1);
        oc.getListOrder();


        System.out.println(ANSI_PURPLE+"Редактирование статуса заказа. Выводим на печать."+ANSI_BLACK);
        oc.editingStatusOrder(1); //Решил просто изменить заказ, по номеру заказа. Выбрав номер ID заказа, статут изменится на Ready.
        oc.getListOrder();


    }


}
