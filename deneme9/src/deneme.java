import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.println("Ikıncı sayiyi giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Ucuncu sayiyi giriniz: ");
        int sayi3 = scanner.nextInt();

        int max = 1;

        if (sayi1 > sayi2 && sayi1 > sayi3){
            max = sayi1;
        }
        else if (sayi2 > sayi1 && sayi2 > sayi3){
            max = sayi2;
        }
        else if (sayi3 > sayi1 && sayi3 > sayi1){
            max = sayi3;
        }

        System.out.println("En buyuk sayi sudur: " + max);

    }
}
