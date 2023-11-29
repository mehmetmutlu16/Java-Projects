import java.util.Random;
public class kablumbaga {
    public void mehmet() {
        int hareket = 0;
        while (hareket < 19) {
            Random r = new Random(); //random sınıfı
            int b = r.nextInt(10);

            if (b > 0 && b <= 5) {
                hareket += 3;
                for (int i = 0; i < hareket; i++) {
                    System.out.print("-");
                }
                System.out.print("K");
                for (int i = 0; i < 20 - hareket; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            } else if (5 < b && b <= 7) {
                hareket -= 6;
                if (hareket <= 5) {
                    hareket = 1;
                }
                for (int i = 0; i < hareket; i++) {
                    System.out.print("-");
                }
                System.out.print("K");
                for (int i = 0; i < 20 - hareket; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            } else if (7 < b && b <= 10) {
                hareket += 1;
                for (int i = 0; i < hareket; i++) {
                    System.out.print("-");
                }
                System.out.print("K");
                for (int i = 0; i < 20 - hareket; i++) {
                    System.out.print("-");
                }
                System.out.println("");

            }
        }
    }
}