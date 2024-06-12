package javaCodingTasks.week03;
public class ReverseNegativeNumber {

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-12345));

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


}
