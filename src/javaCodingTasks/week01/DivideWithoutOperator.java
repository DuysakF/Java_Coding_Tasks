package javaCodingTasks.week01;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        int dividend = 12;
        int divisor = 3;

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Gecersiz islem");
            return;
        }

        // Initialize quotient and perform division using subtraction
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        // Print the results
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + dividend);
    }
}


/*Numbers Divide without / operator
Write a method that can divide two numbers without using division operator

 */

/*
If the divisor is 0, the "Invalid operation" message is displayed and the program is terminated.


The while loop continues as long as the dividend is equal to or greater than the divisor.
In each cycle, the dividend is reduced by the divisor and the quotient is increased by one.
When the loop ends, the quotient variable holds the partition and the dividend variable holds the remainder.
The results are printed on the screen.
 */