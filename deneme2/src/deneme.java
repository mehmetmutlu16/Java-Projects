import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        int yas = scanner.nextInt();
        System.out.println("Yasiniz: "+ yas);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lutfen bir seyler yaziniz:");
        String yazi = scanner1.nextLine();
        System.out.println(yazi);
    }
}
