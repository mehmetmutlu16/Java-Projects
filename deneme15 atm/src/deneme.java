import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bakiye=1000;
        String islemler = "1.islem = Bakiye Sorgulama\n" +
                          "2.islem = Para Cekme\n" +
                          "3.islem = Para Yatırma\n" +
                          "4.islem = Cıkıs Yap";

        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");
        int secim = scanner.nextInt();
        scanner.nextLine();

        switch (secim){
            case 1:
                System.out.println("Bakiyeniz: "+ bakiye);
                break;

            case 2:
                System.out.println("Cekmek istediginiz tutari yaziniz: ");
                int paracekme= scanner.nextInt();
                scanner.nextLine();
                bakiye=bakiye-paracekme;
                System.out.println("Isleminiz basariyla tamamlanmistir.\n Guncel Bakiyeniz:"+bakiye);
                break;

            case 3:
                System.out.println("Yatirmak istediginiz tutari giriniz: ");
                int parayatirma= scanner.nextInt();
                scanner.nextLine();
                bakiye=bakiye+parayatirma;
                System.out.println("Isleminiz basariyla tamamlanmistir.\n Guncel bakiyeniz: "+bakiye);
                break;

            case 4:
                System.out.println("Cikis yapiliyor...");
                break;

            default:
                System.out.println("Yanlis secim yaptiniz!!\n Cikis yapiliyor...");
                break;
        }


    }
}
