import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik ve Fizik problemleri uygulamasina hosgeldiniz...");

        String islemler = "İslemler...\n" +
                "1. Daire Alani Hesaplama\n" +
                "2. Ucgen Cevresi Hesaplama\n" +
                "3. 2 Vektorun Ic Carpimini Hesaplama\n" +
                "q. Cikis...";

        while(true){
            System.out.println("\n");
            System.out.println(islemler);
            System.out.print("İslemi seciniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Cikis yapiliyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Dairenin yaricapinin giriniz: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);
            }
            else if (islem.equals("2")){
                System.out.println("Kenar 1 degerini giriniz: ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2 degerini giriniz: ");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar 3 degerini giriniz: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
            }
            else if (islem.equals("3")){
                Vector vec1 = new Vector("Vec1");
                Vector vec2 = new Vector("Vec2");

                Problem.Fizik.icCarpim(vec1, vec2);
            }
        }
    }
}
