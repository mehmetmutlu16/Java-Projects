import java.util.Scanner;

public class ATM {

    public void calis(hesap hesap){

        login login = new login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamiza Hosgeldiniz");
        System.out.println("**********************");
        System.out.println("Kullanici Girisi");
        System.out.println("**********************");

        int giris_hakki=3;

        while (true){
            if (login.login(hesap)){
                System.out.println("Giris Basarili...");
                break;

            }
            else{
                System.out.println("Giris basarisiz...");
                giris_hakki -= 1;
                System.out.println("Kalan giris hakki ="+ giris_hakki);
            }
            if (giris_hakki==0){
                System.out.println("Giris Hakkiniz Bitti...");
                return;
            }
        }
        System.out.println("*************************");
        String islemler = "1. Bakiye Goruntule\n" +
                "2. Para Yatirma\n" +
                "3. Para Cekme\n" +
                "Cıkıs icin q'ya basiniz";
        System.out.println(islemler);
        System.out.println("*************************");

        while (true){
            System.out.println("Islemi seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q") || islem.equals("Q")){
                System.out.println("Cikis yapiliyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeni: "+ hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.println("Yatirmak istediginiz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")){
                System.out.println("Cekmek istediginiz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else{
                System.out.println("Gecersiz islem secimi yaptiniz!!!");
            }



        }



    }

}
