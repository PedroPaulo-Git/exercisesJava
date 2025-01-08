import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr;
        double result = 0;

        System.out.println("quantas alturas?");
        int howHeigh = sc.nextInt();

        double[] arrAlternative = new double[howHeigh];
        arr = new double[3];

        for (int i= 0 ; i < howHeigh ; i ++){
            System.out.println("altura no array : " + i);
            arrAlternative[i] = Double.parseDouble(sc.next());
        }
        double sum = 0;
        for (int i= 0 ; i < arrAlternative.length ; i ++){
            sum += arrAlternative[i];
            System.out.println(sum);
        }
        result = sum / arrAlternative.length;
        System.out.println("Avarege Result: "+result);
//        while (arrAlternative.length <= howHeigh) {
//            System.out.println("primeira altura : ");
//        arr[0] = Double.parseDouble(sc.next());
//        }
//
//        System.out.println("primeira altura : ");
//        arr[0] = Double.parseDouble(sc.next());
//        System.out.println("segunda altura : ");
//        arr[1] = Double.parseDouble(sc.next());
//
//        arr[2] = Double.parseDouble(sc.next());
//
//        System.out.println(Arrays.toString(arr));
//
//
//
    }
}