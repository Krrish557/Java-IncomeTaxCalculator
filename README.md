# Java-IncomeTaxCalculator
A Java program designed to calculate personal income tax for the 2024-2025 tax year. It processes user input for filing status and taxable income, applying a progressive tax rate system based on provided tax brackets.

This Java program calculates personal income tax for the 2024-2025 tax year based on a user's filing status and taxable income. It applies a progressive tax rate system according to the specified tax brackets.

Features
User Input: Prompts for filing status and taxable income.

Tax Calculation: Computes tax based on a detailed progressive tax table.

Multiple Filing Statuses: Supports four distinct filing statuses:

0: Single filers

1: Married filing jointly or Qualified Widower

2: Married filing separately

3: Head of Household

Formatted Output: Displays the calculated tax amount formatted to two decimal places.

Tax Logic
The program implements a progressive tax system where different portions of the taxable income are taxed at increasing marginal rates. The tax brackets and rates are hardcoded within the application for the 2024-2025 tax year.

How to Run
Prerequisites: Ensure you have the Java Development Kit (JDK) installed on your system.

Compile: Navigate to the directory containing IncomeTaxCalculator.java in your terminal or command prompt and compile the code:

javac IncomeTaxCalculator.java

Run: Execute the compiled Java program:

java IncomeTaxCalculator

Follow Prompts: The program will prompt you to enter the filing status and taxable income.

Example Usage
Here are some examples demonstrating the program's input and output:

Enter the filing status: 0
Enter the taxable income: 100000
Tax is 21720.00

Enter the filing status: 1
Enter the taxable income: 300339
Tax is 76932.87

Enter the filing status: 2
Enter the taxable income: 123500
Tax is 29665.50

Enter the filing status: 3
Enter the taxable income: 454502
Tax is 138932.70

## Technologies Used

* Java
