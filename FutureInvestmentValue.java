
import java.util.Scanner;
import java.text.DecimalFormat;

/*
Problem Description:
Write a program that reads in investment amount, annual interest rate, and 
number of years, and displays the future investment value using the following 
formula: futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)
^(numberOfYears*12).
 */
/**
 *
 * @author patriciashatz
 */
public class FutureInvestmentValue {

    public static void main(String[] args) {
        //Declare boolean variable for while loop and assign "false" value to it
        boolean stop = false;
        while (!stop) 
        {   
            //Create a Scanner object called input 
            Scanner input = new Scanner(System.in);
            //Call to method investmentValue()
            investmentValue(input);
            System.out.println("Would you like to enter another investment" + 
                    " " + "amount? (Yes or No)");
        //Create a Scanner object called "answer" to respond to above question
            Scanner answer = new Scanner(System.in);
            /*
            Read the next line from the input stream and store it in the 
            String variable str
             */
            String str = answer.nextLine();
            /*
            if the user enters "no" or "No", then the program will exit the 
            while loop; if not, the program will continue to run.
            */ 
            if (str.equals("no") || str.equals("No")) {
                stop = true;
            }
        }
    }

    //Creation of method, "investmentValue()", which I call in the main method
    public static void investmentValue(Scanner value) 
        {
            double investmentAmount, annualInterestRate, monthlyInterestRate,
            futureInvestment;
            int numOfYears;

            String one = "Enter investment amount:" + " ";
            String two = "Enter annual interest rate in percentage:" + " ";
            String three = "Enter number of years:" + " ";

            System.out.print(one);
            investmentAmount = value.nextDouble();
            System.out.print(two);
            annualInterestRate = value.nextDouble();
            //Converting annualInterestRate to monthlyInterestRate
            monthlyInterestRate = ((annualInterestRate / 1200.0));
            System.out.print(three);
            numOfYears = value.nextInt();

            futureInvestment = investmentAmount
                * (Math.pow((1 + monthlyInterestRate), (numOfYears * 12)));

        /*
        Here, I create a DecimalFormat format object "df", to format the output 
        number to two places after the decimal point. The # sign denotes a 
        digit. So, I am stating that I want my output number to have 
        2 digits after the decimal point.
         */
        DecimalFormat df = new DecimalFormat(".##");
        /*
        Storing variable futureInvestment, formatted to 2 places after decimal
        point, in String output
         */
        String output = df.format(futureInvestment);
        System.out.println("Your accumulated future value is $" + output);

       }
}
