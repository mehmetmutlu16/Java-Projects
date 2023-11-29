import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz: ");
        double boy = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Lutfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        scanner.nextLine();

        double indeks = (kilo)/(boy*boy);

        System.out.println(indeks);

        if (indeks<18.5){
            System.out.println("Zayif kategoridesiniz "+indeks);
        }
        else if (18.5<=indeks && indeks<25){
            System.out.println("Normal kategoridesiniz "+indeks);
        }
        else if (25<=indeks && indeks<30){
            System.out.println("Fazla kilolu kategoridesiniz "+indeks);
        }
        else if (30<=indeks){
            System.out.println("Obez kategorisindesiniz "+indeks);
        }



    }
}
