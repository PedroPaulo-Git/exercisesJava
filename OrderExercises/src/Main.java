import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.print("Enter client data:");

        System.out.print("name:");
        String name = sc.nextLine();
        System.out.print("Email:");
        String email = sc.nextLine();
        System.out.print("Date:");
        String Date = sc.nextLine();
        Client client = new Client(name, email, sdf.parse(Date));
        System.out.print("Date:"+Date);


        System.out.println("Enter order data:");
        System.out.print("Status:");
        String orderStatus = sc.nextLine();

        Order order = new Order(new Date(),OrderStatus.valueOf(orderStatus),client);
        //System.out.println(order);
        System.out.println("how many items to this order?");
        int items = sc.nextInt();

        for (int i = 0; i < items; i++) {
            System.out.print("Product name:");
            String productName = sc.next();
            System.out.print("Product price:");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity :");
            int productQuantity = sc.nextInt();

            Product newProduct = new Product(productName,productPrice);
            OrderItem newOrderItem = new OrderItem(productQuantity,productPrice,newProduct);
            order.addItem(newOrderItem);
        }
        System.out.println(order);
    }
}