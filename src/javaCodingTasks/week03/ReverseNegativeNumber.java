package javaCodingTasks.week03;
<<<<<<< HEAD

public class ReverseNegativeNumber {

    // Method to reverse a negative number
    public static int reverseNegative(int number) {

        // Convert the negative number to a string
        String numStr = Integer.toString(number);

        // Reverse the string except the negative sign
        String reversedStr = new StringBuilder(numStr.substring(1)).reverse().toString();

        // Add the negative sign back and parse the result as an integer
        int reversedNum = Integer.parseInt("-" + reversedStr);

        return reversedNum;
    }

    public static void main(String[] args) {
        int num = -663; // Example negative number
        int reversedNum = reverseNegative(num);

        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversedNum);
    }
=======
public class ReverseNegativeNumber {

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-1234500));

    }
    public static int reverseNegativeNumber(int number) {
        // Check if the number is negative
        if (number >= 0) {
            System.out.println("Give a negative number: " + number);
            return -number;
        }

        // Convert the number to a string
        String numberStr = Integer.toString(number);

        // Remove the negative sign
        String positiveStr = numberStr.substring(1);

        // Reverse the string
        String reversedStr = new StringBuilder(positiveStr).reverse().toString();

        //remote 0

        // Convert the reversed string back to an integer and add the negative sign
        int reversedNumber = Integer.parseInt(reversedStr);

        return -reversedNumber;
    }


>>>>>>> origin/fatihs
}
