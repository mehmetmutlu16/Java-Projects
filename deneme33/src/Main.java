import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cemberin yaricapini giriniz: ");
        int yaricap = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cemberin rengini giriniz: ");
        String renk = scanner.nextLine();

        cember.alan(yaricap);
        cember.cevre(yaricap);
        cember.renk(renk);
    }
}
