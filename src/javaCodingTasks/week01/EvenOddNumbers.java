package javaCodingTasks.week01;

public class EvenOddNumbers {

    public static void main(String[] args) {
        System.out.println(evenOddNumbers(10));
    }

    public static String evenOddNumbers(int n) {
        return (n % 2 == 0) ? "even" : "odd";
    }
}
