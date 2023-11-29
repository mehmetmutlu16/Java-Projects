import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ABank a1 = new ABank("Mutlu",0.49);
        BBank b1 = new BBank("Mutsuz",0.30);

        System.out.println("Miktar giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int deger = scanner.nextInt();

        System.out.println(a1.isim + "bankasının verdigi rakam: ");
        a1.faizHesapla(deger);

        System.out.println(b1.isim + "bankasının verdigi rakam: ");
        b1.faizHesapla(deger);
    }
}
