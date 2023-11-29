import java.util.Random;

public class main {

    public static void konumuYazdir(){
        for(int i=1;i<=20;i++){
            if(i==kaplumbaga){
                System.out.print("K ");
            }
            if(i==tavsan){
                System.out.print("T ");
            }
            else{
                System.out.print("_ ");
            }
            if(i==20){
                System.out.println("\n");
            }
        }
        if(kaplumbaga >= 20 ){
            bitti=false;
            System.out.println("Kaplumbaga kazandi.");
        }
        else if(tavsan >= 20){
            bitti=false;
            System.out.println("Tavsan kazandi.");
        }
    }

    public static void kaplumbagaHareket(int rndkap){
        if(rndkap>=1 && rndkap<=5){
            kaplumbaga+=3;
            System.out.println("Kaplumbaga 3 ilerliyor.");
        }
        if(rndkap>=6 && rndkap<=7){
            kaplumbaga-=6;
            if(kaplumbaga<=0){
                kaplumbaga=1;
            }
            System.out.println("Kaplumbaga 6 basamak geri.");
        }
        if(rndkap>=8 && rndkap<=10) {
            kaplumbaga += 1;
            System.out.println("Kaplumbaga 1 ilerliyor.");
        }
    }
    public static void tavsanHareket(int rndtav){
        if(rndtav>=1 && rndtav<=2) {
            tavsan+=0;
            System.out.println("Tavsan hareketsiz.");
        }
        if(rndtav>=3 && rndtav<=4) {
            tavsan+=9;
            System.out.println("Tavsan 9 ilerliyor.");
        }
        if(rndtav==5) {
            tavsan-=12;
            if(tavsan<=0){
                tavsan=1;
            }
            System.out.println("Tavsan 12 basamak geri.");
        }
        if(rndtav>=6 && rndtav<=8) {
            tavsan+=1;
            System.out.println("Tavsan 1 ilerliyor.");
        }
        if(rndtav>=9 && rndtav<=10) {
            tavsan-=2;
            if(tavsan<=0){
                tavsan=1;
            }
            System.out.println("Tavsan 2 basamak geri.");
        }

    }

    static int kaplumbaga=1;
    static int tavsan=1;
    static boolean bitti=true;

    public static void main(String[] args) {
        Random rnd = new Random();

        int rndkap,rndtav;

        while(bitti){
            rndkap= 1+rnd.nextInt(10);
            rndtav= 1+rnd.nextInt(10);

            kaplumbagaHareket(rndkap);
            tavsanHareket(rndtav);
            konumuYazdir();
        }



    }
}