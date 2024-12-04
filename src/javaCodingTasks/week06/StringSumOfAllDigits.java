package javaCodingTasks.week06;

/*
***
 Java Coding Tasks - Week6:pushpin:

1.  String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
*
 *

 */
public class StringSumOfAllDigits {

    public static int sumOfAllDigits(String str) {

        int sum = 0;


        for (char ch : str.toCharArray()) {

            if (ch >= '0' && ch <= '9') {
                sum += ch - '0';
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        int result = sumOfAllDigits(input);
        System.out.println("Toplam: " + result); // 20
    }
}
