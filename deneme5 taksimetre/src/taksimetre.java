import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Araciniz kilometrede ne kadar benzin yakiyor:");
        double arac = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Kac kilometre yol yapacaksiniz:");
        int kilometre = scanner.nextInt();

        int benzin=20;

        double toplam = arac*kilometre*benzin;
        System.out.println("Masrafiniz " + toplam + "TL dir");

    }
}
