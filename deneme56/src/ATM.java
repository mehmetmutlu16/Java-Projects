import java.util.Scanner;

public class ATM {
    public static void girisHakki() {
        Scanner scanner = new Scanner(System.in);
        int girisHakki = 3;
        String kullaniciAdi = "mehmetmutlu16";
        String sifre = "123456789";


        while (true) {
            System.out.println("Lutfen kullanici adinizi giriniz: ");
            String kullaniciAdiGiris = scanner.nextLine();

            if (kullaniciAdiGiris.equals(kullaniciAdi)) {
                System.out.println("Lutfen sifrenizi giriniz: ");
                String sifreGiris = scanner.nextLine();
                if (sifreGiris.equals(sifre)) {
                    ATM.islemler();
                } else {
                    System.out.println("Hatali bir sifre girdiniz. Tekrar deneyin...");
                    girisHakki -= 1;
                    if(girisHakki<0) {
                        System.out.println("Giris hakkiniz kalmadi...");
                        break;
                    }
                    else {
                        System.out.println("Kalan giris hakki: " + girisHakki);
                    }
                }
            } else {
                System.out.println("Gecersiz kullanici adi girdiniz...");
                break;
            }
        }
    }

    public static void islemler(){
        int bakiye = 1000;
        int tutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATM Uygulamamiza Hosgeldiniz...");
        while(true){
            String islemler = "1. Para Cekme\n" +
                    "2. Para Yatirma\n" +
                    "3. Bakiye Sorgulama\n" +
                    "q. Cikis";
            System.out.println(islemler);
            String secim = scanner.nextLine();
            if(secim.equals("1")){
                System.out.println("Cekmek istediginiz tutari giriniz: ");
                tutar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Isleminiz basariyla gerceklesmistir. Guncel bakiyeniz: " + (bakiye-tutar));
            }
            if(secim.equals("2")){
                System.out.println("Yatirmak istediginiz tutari giriniz: ");
                tutar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Isleminiz basariyla gerceklestirilmistir. Guncel bakiyeniz: " + (bakiye + tutar));
            }
            if(secim.equals("3")){
                System.out.println("Bakiyeniz: " + bakiye);
            }
            if(secim.equals("q")){
                System.out.println("Cikis yapiliyor...");
                break;
            }
        }
    }
}
