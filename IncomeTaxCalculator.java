import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        // Try-with-resources ensures Scanner is closed automatically
        try (Scanner input = new Scanner(System.in)) {

            // Prompt user to enter filing status (0 to 3)
            System.out.print("Enter the filing status: ");
            int status = input.nextInt();

            // Prompt user to enter taxable income
            System.out.print("Enter the taxable income: ");
            double income = input.nextDouble();

            // Compute tax based on status and income
            double tax = computeTax(status, income);

            // Display the result rounded to 2 decimal places
            System.out.printf("Tax is %.2f%n", tax);
        }
    }

    public static double computeTax(int status, double income) {
        // Tax brackets for different filing statuses:
        // 0 - Single filer
        // 1 - Married jointly
        // 2 - Married separately
        // 3 - Head of household
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},        // Single
            {16700, 67900, 137050, 208850, 372950},      // Married joint
            {8350, 33950, 68525, 104425, 186475},        // Married separate
            {11950, 45500, 117450, 180200, 372950}       // Head of house
        };

        // Tax rates for each bracket tier
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // Select the correct bracket array based on status
        int[] currentBracket = brackets[status];
        double tax;

        // Tax calculation based on progressive brackets

        if (income <= currentBracket[0]) {
            tax = income * rates[0];
        } else if (income <= currentBracket[1]) {
            tax = currentBracket[0] * rates[0]
                + (income - currentBracket[0]) * rates[1];
        } else if (income <= currentBracket[2]) {
            tax = currentBracket[0] * rates[0]
                + (currentBracket[1] - currentBracket[0]) * rates[1]
                + (income - currentBracket[1]) * rates[2];
        } else if (income <= currentBracket[3]) {
            tax = currentBracket[0] * rates[0]
                + (currentBracket[1] - currentBracket[0]) * rates[1]
                + (currentBracket[2] - currentBracket[1]) * rates[2]
                + (income - currentBracket[2]) * rates[3];
        } else if (income <= currentBracket[4]) {
            tax = currentBracket[0] * rates[0]
                + (currentBracket[1] - currentBracket[0]) * rates[1]
                + (currentBracket[2] - currentBracket[1]) * rates[2]
                + (currentBracket[3] - currentBracket[2]) * rates[3]
                + (income - currentBracket[3]) * rates[4];
        } else {
            // Income exceeds all defined brackets; apply highest rate to the excess
            tax = currentBracket[0] * rates[0]
                + (currentBracket[1] - currentBracket[0]) * rates[1]
                + (currentBracket[2] - currentBracket[1]) * rates[2]
                + (currentBracket[3] - currentBracket[2]) * rates[3]
                + (currentBracket[4] - currentBracket[3]) * rates[4]
                + (income - currentBracket[4]) * rates[5];
        }

        return tax;
    }
}
