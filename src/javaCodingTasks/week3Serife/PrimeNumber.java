package javaCodingTasks.week3Serife;

public class PrimeNumber {
    //Write a method that can check if a number is prime or not
    //Prime number is only divisible by one and itself
    public static void main(String[] args) {
        System.out.println(isPrime(-7));
        System.out.println(isPrime(457));
        System.out.println(isPrime(6));
    }
    public static boolean isPrime(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }

        return true;
    }
}
