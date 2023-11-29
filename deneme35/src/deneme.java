import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dizi icin 5 deger giriniz: ");
        int[] list = new int[5];

        for (int i = 0; i < 5; i++) {
            list[i] = scanner.nextInt();
        }

        int min = list[0];

        for (int i = 0; i < 5; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }

        int max = list[0];

        for (int i = 0; i < 5; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }

        System.out.println("Max deger: " + max);
        System.out.println("Min deger: " + min);


    }
}