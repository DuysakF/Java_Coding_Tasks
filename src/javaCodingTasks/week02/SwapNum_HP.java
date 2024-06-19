package javaCodingTasks.week02;

public class SwapNum_HP {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);

        // swap(5,10);
    }

    public static void swap(int a, int b) {
        a = a + b;  // a is 15 and b is 10
        b = a - b;  // a is 15 and b is 5
        a = a - b;  // a is 10 and b is 5

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

}


/*
Numbers -- Swap Numbers
Swap two variable values without using a third variable
*/