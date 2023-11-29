import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen faktoriyelini almak istediginiz sayiyi giriniz: ");
        int sayi = scanner.nextInt();

        int sonuc;
        sonuc=1;
        int i;

        for (i=1;i<=sayi;i++){
            sonuc=sonuc*i;
        }

        System.out.println(sonuc);


    }
}
