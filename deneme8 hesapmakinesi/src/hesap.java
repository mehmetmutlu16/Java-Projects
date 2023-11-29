import java.util.Scanner;

public class hesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi giriniz: ");
        double sayi1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz: ");
        double sayi2 = scanner.nextInt();
        scanner.nextLine();

        double cevap;

        System.out.println("Lutfen yapmak istediginiz islemi giriniz(+,-,/,*,%): ");
        String islem = scanner.nextLine();

        switch (islem){
            case "+":
                cevap=sayi1+sayi2;
                System.out.println(cevap);
                break;

            case "-":
                cevap=sayi1-sayi2;
                System.out.println(cevap);
                break;

            case "/":
                cevap=sayi1/sayi2;
                System.out.println(cevap);
                break;

            case "*":
                cevap=sayi1*sayi2;
                System.out.println(cevap);
                break;

            case "%":
                cevap=sayi1%sayi2;
                System.out.println(cevap);
                break;

        }
    }
}
