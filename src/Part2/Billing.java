package Part2;

/**
 * Uses Overloaded methods to compute for multiple scenarios
 */
public class Billing {
    public static void main(String[] args)
    {
        double billingOutput = computeBill(1,2,1);

        System.out.println("Billing output is $" + billingOutput);

    }
    private static double computeBill(double price)
    {
//        Computes for one argument
        return price + (price*0.08);
    }
    private static double computeBill(double price, int quantity)
    {
//        Computes for three arguments
        double total = price*quantity;

        return total + (total*0.08);
    }
    private static double computeBill(double price, int quantity, double couponValue)
    {
//        Computes for three arguments
        double total = (price*quantity) - couponValue;

        return total + (total*0.08);
    }
}
