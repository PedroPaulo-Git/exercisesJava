package Ex_73;

public class currencyConverter {
    public static double converter (double dollarPrice, double howManyDollars){
        return ((dollarPrice * 0.06) + dollarPrice) * howManyDollars ;
    }
}
