package Part1;

/**
 * Performs methods based off integer variables
 */
public class NumbersDemo {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;

        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);

        displayNumberPlusFive(a);
        displayNumberPlusFive(b);

        displayNumberSquared(a);
        displayNumberSquared(b);

    }

    private static double displayTwiceTheNumber(int number)
    {
        System.out.println("Doubled number is " + (number*2));
        return number*2;
    }

    private static double displayNumberPlusFive(int number)
    {
        System.out.println("Number plus five is " + (number + 5));
        return number + 5;
    }

    private static double displayNumberSquared(int number)
    {
        System.out.println("Squared number is " + (number * number));
        return number * number;
    }
}
