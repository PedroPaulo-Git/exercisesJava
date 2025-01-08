package Ex_73;

import java.util.Locale;
import java.util.Scanner;
import Ex_73.currencyConverter;

public class ex4_73 {
    double dollarPrice;
    double howManyDollars;

    public void ConverterDollar (){
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.print("Dollar prince: ");
    dollarPrice = sc.nextDouble();
    System.out.print("how many dollars do you will bought ? : ");
    howManyDollars = sc.nextDouble();
    System.out.print("amount to be paid in reais : "+ currencyConverter.converter(dollarPrice,howManyDollars));
    sc.close();
}

}
