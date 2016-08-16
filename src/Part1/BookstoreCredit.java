package Part1;

import javax.swing.JOptionPane;

/**
 * Takes students grade and name and shows credit received based upon them
 */
public class BookstoreCredit {
    public static void main(String[] args)
    {
        String userName = JOptionPane.showInputDialog(null, "Please enter your name :");
        String userGrade = JOptionPane.showInputDialog(null, "Please enter your current grade:");

        double grade = Double.parseDouble(userGrade);

        String studentMessage = CreditCalculation(userName,grade);

        JOptionPane.showMessageDialog(null, studentMessage);
    }

    private static String CreditCalculation(String userName, double grade)
    {
        double gradeUpdated = grade * 10;

        return userName + " has a grade of " + grade + ", and will receive a bookstore credit of $" +
                gradeUpdated;
    }
}
