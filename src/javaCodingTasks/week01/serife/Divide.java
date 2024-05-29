package javaCodingTasks.week01.serife;

public class Divide {
    public static void main(String[] args) {
        //Divide without /operator
        //Write a method that can divide
        // two numbers without using division operator


        divide(6,2);
    }
    public static void divide(int num, int num1){

        int count = 0;

        while (num >= num1){
            count++;
            num -= num1;
        }
        System.out.println( count + " with remainder " + num);
    }
}
