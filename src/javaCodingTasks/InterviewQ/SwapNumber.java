package javaCodingTasks.InterviewQ;

public class SwapNumber {
    public static void main(String[] args) {
        // Initialize numbers
        int number1 = 5;
        int number2 = 10;

        System.out.println(swap(number1, number2));



    }

    // Method to swap numbers
    public static String swap(int num1,int  num2) {
        num2 = (num2+ num1)-(num1=num2);
        return  "Number 1 = "+ num1+ " Number2=" + num2;

    }
}