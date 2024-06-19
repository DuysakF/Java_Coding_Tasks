package javaCodingTasks.sema.week01;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        int bolunen = 12;
        int bolen = 3;
        int count = 0;

//        if (bolen == 0) {
//            System.out.println("Geçersiz işlem: Bölme sıfır ile yapılamaz.");
//            return;
//        }

        int orijinalBolunen = bolunen;  // Orijinal bölünen

        while (bolunen >= bolen) {
            bolunen -= bolen;
            count++;
        }

        System.out.println("Bölüm: " + count);
        System.out.println("Kalan: " + bolunen);
        System.out.println(orijinalBolunen + " sayısının " + bolen + " ile bölünmesi sonucu: " + count );
    }
}
