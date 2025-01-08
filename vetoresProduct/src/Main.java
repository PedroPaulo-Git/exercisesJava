import java.util.Scanner;
import entites.Product;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        for (int i = 0; i < n;i++){
            sc.nextLine();
            String nameProd = sc.nextLine();
            double priceProd = sc.nextDouble();
            vect[i] = new Product(nameProd,priceProd);

        }
        double sum = 0;
        for (int i = 0; i < n;i++){
           sum += vect[i].getPriceProduct();

        }
        double result = sum / n;
        System.out.println("result : "+result);
        sc.close();
    }
}