import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk dik kenari giriniz:");
        int kenar1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Lutfen ikinci dik kenari giriniz:");
        int kenar2 = scanner.nextInt();

        double hipotenus = Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println("Hipotenus= "+hipotenus);
    }
}
