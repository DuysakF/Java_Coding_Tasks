package javaCodingTasks.week03;

public class ReverseNegativeNum_HP {

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-123)); // -321
        System.out.println(reverseNegativeNumber(-9876)); // -6789

    }

    public static int reverseNegativeNumber(int n) {

        // Ensure the number is negative
        if (n >= 0) {
            throw new IllegalArgumentException("The number is not negative");
        }

        // Convert to positive, reverse, then make it negative again
        int reversed = 0;
        n = -n;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return -reversed;
    }


}

/*
Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
*/