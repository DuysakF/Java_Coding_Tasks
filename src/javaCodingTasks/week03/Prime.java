package javaCodingTasks.week03;

public class Prime {

    public static void main(String[] args) {
        System.out.println("isPrime(10) = " + isPrime(13));
    }

    public static boolean isPrime(int number) {
        // check numbers if it is negative
        if (number <= 1) {
            return false;
        }

        // 2, 3 and 5 are prime numbers
        if (number <= 3 || number == 5) {
            return true;
        }

        // Check if the number is divisible by 2 or 3
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        // Check for from 5 to the root of the number
        int i;
        for (i = 5; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

