package javaCodingTasks.week02;

public class ConsecutiveNumbers_HP {
    public static void main(String[] args) {
        consecutiveNumbers(20);
    }

    public static void consecutiveNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            String result = "";


            // Each condition is checked independently
            // to handle cases where a number is divisible by multiple values

            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }

            // If no conditions were met, converts an integer i into its string
            if (result.isEmpty()) {
                result = Integer.toString(i);
            }

            System.out.println(result);
        }



    }
}
