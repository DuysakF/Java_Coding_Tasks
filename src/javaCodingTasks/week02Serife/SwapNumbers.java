package javaCodingTasks.week02Serife;

public class SwapNumbers {
    public static void main(String[] args) {
        //1️⃣ Numbers -- Swap Numbers
        //Swap two variable values without using a third variable
        // I can do the operation addition and subtraction
        int a = 5;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping is a "  +  a);
        System.out.println("After swapping is b "  +  b);
    }
}
