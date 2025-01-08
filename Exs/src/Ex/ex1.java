package Ex;

import java.util.Scanner;

public class ex1 {
    Scanner sc = new Scanner(System.in);
//    public double retValueX = sc.nextDouble();
//    public double retValueY = sc.nextDouble();
        public double retValueX;
        public double retValueY;

//
//        System.out.println("First Value: " + retValueX);
//        System.out.println("Second Value  " + retValueY);
//
//        double area = retValueX * retValueY;
//        System.out.println("Area : " + area);
//
//        double perimeter =
//        System.out.println("Perimeter : " + perimeter);
    public double area() {

        return retValueX * retValueY;

    }
        public double diagonal() {

            return Math.sqrt(retValueX * retValueX + retValueY * retValueY);

        }
        public double perimeter() {

            return  2 * (retValueX + retValueY) ;

        }
        //double diagonal = retValueX * retValueY




}
