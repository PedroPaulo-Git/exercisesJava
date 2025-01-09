import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("how many numbers ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        int[] numberPar = new int[n];
        for (int i =0; i < number.length; i++){
            System.out.print("write a number : ");
            number[i] = sc.nextInt();

        }
        System.out.println("NUMEROS PARES : ");
        int sum = 0;
        for (int i =0; i < number.length; i++){
            if (number[i] % 2 == 0){
                System.out.println(number[i]);
                sum++;
            }

        }
        System.out.print("NUMEROS DE PARES : " + sum);
        sc.close();
    }
}