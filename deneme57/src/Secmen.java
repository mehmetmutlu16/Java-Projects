import java.util.Scanner;

public class Secmen {
    static String isim;

    public static void secmen(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayın secmen lutfen isminizi giriniz: ");
        isim = scanner.nextLine();
    }
}