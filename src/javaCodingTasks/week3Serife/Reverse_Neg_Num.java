package javaCodingTasks.week3Serife;

public class Reverse_Neg_Num {
    //Write a return method that can reverse negative number and return it as int
    public static void main(String[] args) {
        System.out.println(NegReverse(340));

    }
    public static int NegReverse(int x) {

        int rev = 0;
        while( x < 0 ){
            int digit = x % 10; // reads the last digit
            rev = (rev * 10) + digit;//step 2 reverse my number
            x = x / 10;
        }
        return rev;
    }


}

