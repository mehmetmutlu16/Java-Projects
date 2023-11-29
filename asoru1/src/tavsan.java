import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class tavsan {
    public static void oyun() {
        int tavsan = 0;
        int kaplumbaga = 0;
        while (tavsan < 20) {
            Random r = new Random(); //random sınıfı
            int a = r.nextInt(10);
            if(tavsan<0){
                tavsan = 0;
            }

            if (a >= 0 && a <= 2) {
                tavsan += 0;
                for (int i = 0; i < tavsan; i++) {
                    System.out.print("-");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - tavsan; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            } else if (2 < a && a <= 4) {
                tavsan += 9;
                for (int i = 0; i < tavsan; i++) {
                    System.out.print("-");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - tavsan; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            } else if (4 < a && a <= 5) {
                tavsan -= 12;
                if (tavsan<=0){
                    tavsan =0;
                }
                for (int i = 0; i < tavsan; i++) {
                    System.out.print("-");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - tavsan; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            }
            else if (5<a && a<=8){
                tavsan +=1;
                for (int i = 0; i < tavsan; i++) {
                    System.out.print("-");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - tavsan; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            }
            else if (8<a && a<=10){
                tavsan -=2;
                for (int i = 0; i < tavsan; i++) {
                    System.out.print("-");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - tavsan; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            }
            if(tavsan>20){
                tavsan = 20;
            }


            int b = r.nextInt(10);

            if(kaplumbaga>20){
                kaplumbaga = 20;
            }

            if (b >= 0 && b <= 5) {
                kaplumbaga += 3;
                for (int i = 0; i < kaplumbaga; i++) {
                    System.out.print("-");
                }
                System.out.print("K");
                for (int i = 0; i < 20 - kaplumbaga; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            } else if (5 < b && b <= 7) {
                kaplumbaga -= 6;
                if (kaplumbaga <= 5) {
                    kaplumbaga = 1;
                }
                for (int i = 0; i < kaplumbaga; i++) {
                    System.out.print("-");
                }
                System.out.print("K");
                for (int i = 0; i < 20 - kaplumbaga; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            } else if (7 < b && b <= 10) {
                kaplumbaga += 1;
                for (int i = 0; i < kaplumbaga; i++) {
                    System.out.print("-");
                }
                System.out.print("K");
                for (int i = 0; i < 20 - kaplumbaga; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            }

            System.out.println("Tavsan= "+tavsan);
            System.out.println("Kaplumbaga= "+kaplumbaga);
            System.out.println("");


            if (tavsan == kaplumbaga){
                System.out.println("OUCH");
            }
            if (tavsan >= 20){
                System.out.println("Tavşan kazandı, yuh!");
                break;
            }
            if (kaplumbaga >= 20){
                System.out.println("Kaplumbağa kazandı,oley!");
                break;
            }
            if (tavsan>=20 && tavsan == kaplumbaga){
                System.out.println("Berabere!");
                break;
            }
        }

    }
}