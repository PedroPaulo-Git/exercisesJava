

import Ex.ex1;
import Ex.ex2;
import Ex.ex3;
//import Ex.ex4;
import Ex_73.ex4_73;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 2 3 or 4");
        int startEx = sc.nextInt();
        System.out.println("Escolhido:"+ startEx);

        if (startEx == 1 ){
            ex1 game = new ex1();

            System.out.println("Enter a two values of rectangle: ");
            System.out.println("First Value X: " + game.retValueX);
            game.retValueX = sc.nextDouble();
            System.out.println("Second Value Y" + game.retValueY);
            game.retValueY = sc.nextDouble();

            System.out.printf("AREA = %.2f%n", game.area());
            System.out.printf("PERIMETER  = %.2f%n", game.perimeter());
            System.out.printf("DIAGONAL  = %.2f%n", game.diagonal());

        }else if (startEx == 2) {
            ex2 game = new ex2();
            game.showSalary();
            game.showPercentage();
            game.showUpdated();
        }else if (startEx == 3) {
            ex3 game = new ex3();
            game.calculateNota();
        }
        else if (startEx == 4) {
            ex4_73 game = new ex4_73();
            game.ConverterDollar();
        }
//        else if (startEx == 5) {
//            ex4 game = new ex4();
//            game.ex4run();
//        }

    }
}