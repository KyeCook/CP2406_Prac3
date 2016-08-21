package Part2;

/**
 * Uses Overloaded methods to compute for multiple scenarios
 */
public class FormLetterWriter {
    public static void main(String[] args)
    {
        System.out.println(displaySalutation("Kye", "Cook"));
    }
    private static String displaySalutation(String userLastName)
    {
        return "Dear Mr. or Ms. " + userLastName;
    }
    private static String displaySalutation(String userFirstName, String userLastName)
    {
        return "Dear " + userFirstName + " " + userLastName;
    }
}
