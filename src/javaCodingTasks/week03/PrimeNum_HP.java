package javaCodingTasks.week03;

public class PrimeNum_HP {

    public static void main(String[] args) {

        System.out.println("isPrimeNum(2) = " + isPrimeNum(2));
        System.out.println("isPrimeNum(5) = " + isPrimeNum(5));
        System.out.println("isPrimeNum(11) = " + isPrimeNum(11));
        System.out.println("isPrimeNum(1) = " + isPrimeNum(1));
        System.out.println("isPrimeNum(7) = " + isPrimeNum(7));
        System.out.println("isPrimeNum(6) = " + isPrimeNum(6));
        System.out.println("isPrimeNum(8) = " + isPrimeNum(8));
        System.out.println("isPrimeNum(14) = " + isPrimeNum(14));

    }

    public static boolean isPrimeNum(int n){

        if (n>=1){
            return false;
        }
        for (int i = 2; i < n ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }




    // The number is divisible only itself evenly and by 1 is called Prime NUm.
}

/*
Numbers -- Prime Number
Write a method that can check if a number is
prime or not*/