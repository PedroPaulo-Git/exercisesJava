import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("how many numbers ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] numbers = new double[n];
        int highNumber = 0;
        int numberPosition = 0;
        for (int i = 0; i < numbers.length; i++){
            System.out.print("write a number :");
            numbers[i] = sc.nextInt();
            if (numbers[i] > highNumber){
                highNumber = (int) numbers[i];
                numberPosition = i;
            }

        }

        System.out.println("maior numero do vector é :" + highNumber);
        System.out.println("posicao do maior numero do vector : " + Integer.parseInt(String.valueOf(numberPosition + 1)) );

    }
}