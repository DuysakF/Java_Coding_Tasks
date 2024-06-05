package javaCodingTasks.sema.week01;

public class EvenOddNumbers {
    public static void main(String[] args) {
        oddEven(8);
        oddEven(3);

    }
    public static void oddEven(int num){
        if(num%2==0){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }

    }
}
