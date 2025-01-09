import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("how many people ?");
        int n = sc.nextInt();
        String[] names = new String[n];
        double[] height = new double[n];
        int[] years = new int[n];


        double heightAvarage = 0;
        double yearsOldPorcentage = 0;
        String[] nameLessThan16 = new String[n];

        for (int i =0;i < n;i++){
            System.out.println("information of the "+i+"a person" );
            System.out.print("name :");
            names[i] = sc.next();
            System.out.print("height :");
            height[i] = sc.nextDouble();
            heightAvarage += height[i];
            System.out.print("years old :");
            years[i] = sc.nextInt();
            if (years[i] < 16){
                System.out.println("!!! Less than 16 years old !!!");
                nameLessThan16[i] = names[i];

            }

        }

        System.out.println("registred people :");
        for (int i =0;i < n;i++){
            System.out.println("__________________________");
            System.out.println("name :" + names[i]);
            System.out.println("height :" + height[i]);
            System.out.println("years old :" + years[i]);

        }
        System.out.println("__________________________");
        System.out.println("Avarage : "+heightAvarage / n);
        System.out.println("__________________________");

        double lessThan16 = 0;

        for (int i =0;i < n;i++){
            if(years[i] < 16){
                yearsOldPorcentage = (double) years[i] / n;
                lessThan16++;


            }


        }
        System.out.println("Less than 16  : "+ lessThan16+ " ");
        System.out.println("Porcentage : "+ (lessThan16 / n ) * 100 + "%");
        System.out.println("NAME LESS THAN 16 : ");
        for (String s : nameLessThan16) {
            if (s != null)
                System.out.println(s);
        }

    }
}