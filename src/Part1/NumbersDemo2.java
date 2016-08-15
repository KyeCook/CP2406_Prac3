package Part1;
import javax.swing.JOptionPane;

/**
 * Performs methods based off integer variables
 */
public class NumbersDemo2 {
    public static void main(String[] args)
    {
        String userInputA = JOptionPane.showInputDialog(null, "Enter First Number");
        String userInputB = JOptionPane.showInputDialog(null, "Enter Second Number");

        int a = Integer.parseInt(userInputA);
        int b = Integer.parseInt(userInputB);

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
