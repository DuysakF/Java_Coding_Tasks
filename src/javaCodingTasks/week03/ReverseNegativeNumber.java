package javaCodingTasks.week03;

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
}
