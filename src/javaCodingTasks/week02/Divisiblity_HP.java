package javaCodingTasks.week02;

public class Divisiblity_HP {

    public static void main(String[] args) {

        String divisibleBy3 = "Divisible By 3:";
        String divisibleBy5 = "Divisible By 5:";
        String divisibleBy15 = "Divisible By 15:";

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += " " + i;
            } else if (i % 3 == 0) {
                divisibleBy3 += " " + i;
            } else if (i % 5 == 0) {
                divisibleBy5 += " " + i;
            }
        }

        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);

    }
}
