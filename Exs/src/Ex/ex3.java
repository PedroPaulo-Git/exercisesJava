package Ex;

import java.util.Scanner;

public class ex3 {
    public String name;
    public double n1 ;
    public double n2 ;
    public double n3 ;
    public double total ;
    public void calculateNota (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name");
        name = sc.nextLine();
        System.out.println("Write your notes (n1,n2,n3)..");

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        total = (n1 + n2 + n3);
        if (total < 60){
         System.out.println("Student "+name+" FAILED "+ total+ " | 100" + " remains: " + ( 100 - total));
        }
        else if (total > 60){
         System.out.println("Student "+name+" PASS * "+total+ " | 100" );
        }
    }
}
