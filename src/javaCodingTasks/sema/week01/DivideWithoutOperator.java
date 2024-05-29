package javaCodingTasks.sema.week01;

public class DivideWithoutOperator {
    public static void main(String[] args) {

            int bolunen =12;
            int bolen=3;
            int count=0;
            if (bolen==0){
                System.out.println("Gecersiz islem");
            }
            while (bolunen>=bolen){
                bolunen-=bolen;
                count++;


            }
            System.out.println(count);
            System.out.println(bolunen);

        }
    }


