public class yarisma {
    static int tavsan = 1;
    static int kaplumbaga = 1;
    private static boolean bitti = true;

    public static void kaplumbagaHareket(int rndkaplumbaga){

        if(rndkaplumbaga>=1 && rndkaplumbaga<=5){
            kaplumbaga +=3;
            System.out.println("Kaplumbaga 3 ilerliyor.");
        }
        if(rndkaplumbaga>=6 && rndkaplumbaga<=7){
            kaplumbaga-=6;
            if(kaplumbaga<=0){
                kaplumbaga = 1;
            }
            System.out.println("Kaplumbaga 6 basamak geri gidiyor.");
        }
        if(rndkaplumbaga>=8 && rndkaplumbaga<=10){
            kaplumbaga+=1;
            System.out.println("Kaplumbaga 1 ilerliyor.");
        }
    }

    public static void tavsanHareket(int rndtavsan){
        if(rndtavsan>=1 && rndtavsan<=2){
            tavsan+=0;
            System.out.println("Tavsan hareketsiz kaliyor.");
        }
        if(rndtavsan>=3 && rndtavsan<=4){
            tavsan+=9;
            System.out.println("Tavsan 9 ilerliyor.");
        }
        if(rndtavsan==5){
            tavsan-=12;
            if(tavsan<=0){
                tavsan=1;
            }
            System.out.println("Tavsan 12 basamak geri gidiyor.");
        }
        if(rndtavsan>=6 && rndtavsan<=8){
            tavsan+=1;
            System.out.println("Tavsan 1 ilerliyor.");
        }
        if(rndtavsan>=9 && rndtavsan<=10){
            tavsan-=2;
            if(tavsan<=0){
                tavsan=1;
            }
            System.out.println("Tavsan 2 basamak geri gidiyor.");
        }

        for(int i=1; i<=20; i++){
            if(i==kaplumbaga){
                System.out.print("K");
            }
            if(i==tavsan){
                System.out.print("T");
            }
            else{
                System.out.print("_");
            }
            if(i==20) {
                System.out.println("");
            }
        }
        if(tavsan == kaplumbaga){
            System.out.println("OUCH");
        }
        System.out.println("Tavsan: " + tavsan);
        System.out.println("Kaplumbaga: " + kaplumbaga);
        System.out.println("");

        if(kaplumbaga>=20){
            bitti = false;
            System.out.println("Kaplumbaga kazandi oley.");
        }
        else if(tavsan>=20){
            bitti = false;
            System.out.println("Tavsan kazandi, yuh.");
        }
    }

    public static void setBitti(boolean bitti) {
        yarisma.bitti = bitti;
    }

    public static boolean getBitti(){
        return bitti;
    }
}