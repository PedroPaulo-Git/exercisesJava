import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("how many numbers ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        for (int i =0; i < numbers.length; i++){
            System.out.print("write a number :");
            numbers[i] = sc.nextInt();
            sum += numbers[i];

        }

        System.out.println("valores:");
         for (int i =0; i < numbers.length; i++){
             System.out.print(" - "+numbers[i]+" - ");
        }
        System.out.println("sum:"+sum);
        double average = sum / numbers.length;
        String formatted = String.format("%.2f", average);
        System.out.println("average:"+formatted);
    }
}