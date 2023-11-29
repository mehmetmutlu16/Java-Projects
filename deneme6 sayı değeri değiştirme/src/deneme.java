import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birincisayi;
        int ikincisayi;
        System.out.println("Lutfen birinci sayiyi giriniz:");
        birincisayi = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Lutfen ikinci sayiyi giriniz:");
        ikincisayi = scanner.nextInt();

        System.out.println("Birinci sayi: "+ birincisayi +" Ikinci sayi: "+ ikincisayi);

        int gecici;
        gecici = birincisayi;
        birincisayi=ikincisayi;
        ikincisayi=gecici;

        System.out.println("Degistirildikten sonra ");
        System.out.println("Birinci sayi: "+ birincisayi +" Ikinci sayi: "+ ikincisayi);


    }
}
