package javaCodingTasks.sema.week03;

public class PrimeNumbers {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 53;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
//Örneğin, 36 sayısını ele alalım. 36'nın karekökü 6'dır. Eğer 36, 6'dan büyük bir sayının karesi olarak ifade edilebilseydi,
// bu sayı 6'dan küçük bir sayı ile çarpılacaktı. Dolayısıyla, 36'nın asal olmadığını anlamak için 6'dan küçük sayılarla bölme işlemi yeterli olacaktır.
//
//Bu nedenle, bir sayının asal olup olmadığını kontrol etmek için, 2'den başlayarak o sayının kareköküne kadar olan sayıları kontrol etmek yeterlidir.
// Bu, gereksiz işlem yapılmasını önler ve algoritmayı daha verimli hale getirir.