import java.util.Scanner;

public class indeks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz: ");
        double boy = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Lutfen kilonuzu kg cinsinden giriniz: ");
        double kilo = scanner.nextDouble();

        double indeks = kilo/(boy*boy);
        System.out.println("Indeksiniz : " +indeks);
    }
}
