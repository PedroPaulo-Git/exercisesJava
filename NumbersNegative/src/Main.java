import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want :");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int[] negativeNumber = new int[numbers.length];

        for (int i = 0;i < n;i++){
            System.out.print("write a number :");
            numbers[i] = Integer.parseInt(sc.next());
            if (numbers[i] > 10){
                numbers[i] = 0;
                System.out.print("less than 10 please (write again) :");
                numbers[i] = Integer.parseInt(sc.next());
            }
            else if (numbers[i] < 0){
                System.out.println("negative number !! ");
                negativeNumber[i] = numbers[i];
            }
        }
        System.out.println("negative numbers : ");

       for (int i = 0; i < negativeNumber.length; i++){
           if (negativeNumber[i] < 0){
               System.out.println(negativeNumber[i]);
           }

       }
//        System.out.println("numbers:"+numbers[0]);
    }
}