import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scanner.nextInt();
        scanner.nextLine(); //Dummy

        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.println(yas);
        System.out.println(isim);
    }
}
