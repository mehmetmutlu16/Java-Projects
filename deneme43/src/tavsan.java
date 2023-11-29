public class tavsan {
    public void elif(int a) {
        int hareket1 = 0;
        while (hareket1 < 19) {

            if (a > 0 && a <= 2) {
                hareket1 += 0;
                for (int i = 0; i <= hareket1; i++) {
                    System.out.print("_");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - hareket1; i++) {
                    System.out.print("_");
                }
                System.out.println("");
            } else if (2 < a && a <= 4) {
                hareket1 += 9;
                for (int i = 0; i < hareket1; i++) {
                    System.out.print("_");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - hareket1; i++) {
                    System.out.print("_");
                }
                System.out.println("");
            } else if (4 < a && a <= 5) {
                hareket1 -= 12;
                if (hareket1 <= 0) {
                    hareket1 = 1;
                }
                for (int i = 0; i < hareket1; i++) {
                    System.out.print("_");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - hareket1; i++) {
                    System.out.print("_");
                }
            } else if (5 < a && a <= 8) {
                hareket1 += 1;
                for (int i = 0; i < hareket1; i++) {
                    System.out.print("_");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - hareket1; i++) {
                    System.out.print("_");
                }
            } else if (8 < a && a <= 10) {
                hareket1 -= 2;
                for (int i = 0; i < hareket1; i++) {
                    System.out.print("_");
                }
                System.out.print("T");
                for (int i = 0; i < 20 - hareket1; i++) {
                    System.out.print("_");
                }
            }
        }
    }
}
