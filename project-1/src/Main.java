import entities.product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        product mouse,chair;
        mouse = new product();


        System.out.print("Product Name : ");
        mouse.name = sc.nextLine();
        System.out.print("Product price : ");
        mouse.price = Integer.parseInt(sc.nextLine());
        System.out.print("Product quantity in stock : ");
        mouse.quantity = Integer.parseInt(sc.nextLine());

        System.out.println("Product in stock :"+ mouse.name +"  -  R$:"+ mouse.price +"  -  #"+ mouse.quantity);
        System.out.println("total value in stock : R$:" + mouse.totalValueInStock());
        System.out.print("Number of product to be stocked : " );
       int newQuantity = mouse.quantity;
            newQuantity += Integer.parseInt(sc.nextLine());
//        mouse.addedStock(newQuantity);


        System.out.println("Product in stock :"+ mouse.name +"  -   R$:"+ mouse.price +"  -   #" + mouse.addedStock(newQuantity));
        System.out.println("total value in stock : R$:" + newQuantity * mouse.price);
        System.out.print("Number of product to be << REMOVED >> to stock : " );
        newQuantity -= Integer.parseInt(sc.nextLine());
        System.out.println("Product in stock :"+ mouse.name +"  -   R$:"+ mouse.price +"  -  #" +mouse.removeFromStock(newQuantity));
        System.out.println("total value in stock : R$:" + newQuantity * mouse.price);













        sc.close();

    }
}