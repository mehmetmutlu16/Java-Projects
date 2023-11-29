import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calisanlar programina hosgeldiniz...");
        String islemler = "Islemler...\n" +
                "1. Yazilimci islemleri\n" +
                "2. Yonetici islemleri\n" +
                "Cikis icin q'ya basiniz";
        System.out.println("*******************************");
        System.out.println(islemler);
        System.out.println("*******************************");

        while (true){
            System.out.println("Islemi seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else if (islem.equals("1")){
                yazilimci yazilimci1 = new yazilimci("Mehmet","Mutlu",1907,"C, JAVA, PYTHON");
                String yazilimciislem = "1. Format at\n" +
                        "2. Bilgileri goster\n" +
                        "Cikis icin q'ya basiniz.";
                System.out.println(yazilimciislem);

                while (true){
                    System.out.println("Islemi seciniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yazilimci islemlerinden cikiliyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.println("Isletim sistemi: ");
                        String isletimsistemi = scanner.nextLine();
                        yazilimci1.formatat(isletimsistemi);
                    }
                    else if (y_islem.equals("2")){
                        yazilimci1.bilgilerigoster();
                    }
                    else{
                        System.out.println("Gecersiz islem girisi yaptiniz!!!!");
                    }

                }
            }
            else if (islem.equals("2")){
                yonetici yonetici1 = new yonetici("Sefa","Mutlu",19071,10);

                String yoneticiislem = "Yonetici islemleri\n" +
                        "1. Zam yap\n" +
                        "2. Bilgileri goster\n" +
                        "Cikis icin q'ya basiniz";
                System.out.println(yoneticiislem);

                while (true){
                    System.out.println("Islemi seciniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yonetici islemlerinden cikiliyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunuz: ");
                        int zammiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici1.zamyap(zammiktari);
                    }
                    else if (y_islem.equals("2")){
                        yonetici1.bilgilerigoster();
                    }
                    else{
                        System.out.println("Gecersiz islem girisi yaptiniz!!!");
                    }

                }

            }
            else{
                System.out.println("Gecersiz islem girisi yaptiniz!!!!");
            }

        }
    }
}
