package javaCodingTasks.sema.week03;

public class ReverseNegativeNumber {
    public static int reverseNegative(int number) {
        // Sayıyı bir stringe dönüştür
        String numberString = Integer.toString(number);

        if (number < 0) {
            numberString = numberString.substring(1);//burda sadece sayiyi almak icin substring kullandik

            StringBuilder reversed = new StringBuilder(numberString).reverse();

            int reversedNumber = Integer.parseInt(reversed.toString());//stringi in te cevirdik
            return -reversedNumber;
        } else {
            // Eğer sayı pozitifse, sadece tersine çevir
            StringBuilder reversed = new StringBuilder(numberString).reverse();
            return Integer.parseInt(reversed.toString());
        }
    }

    public static void main(String[] args) {
        int negativeNumber = -79;
        int reversedNegative = reverseNegative(negativeNumber);
        System.out.println("Reversed negative number is: " + reversedNegative);
    }
}
