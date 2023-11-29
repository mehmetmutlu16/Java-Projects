import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dogun yilinizi giriniz: ");
        int dogum_yili = scanner.nextInt();

        int zodyag = dogum_yili%12;

        switch (zodyag){
            case 0:
                System.out.println("Çin zodyaği burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin zodyaği burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin zodyaği burcunuz: Kopek");
                break;
            case 3:
                System.out.println("Çin zodyaği burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin zodyaği burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin zodyaği burcunuz: Okuz");
                break;
            case 6:
                System.out.println("Çin zodyaği burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin zodyaği burcunuz: Tavsan");
                break;
            case 8:
                System.out.println("Çin zodyaği burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin zodyaği burcunuz: Yilan");
                break;
            case 10:
                System.out.println("Çin zodyaği burcunuz: At");
                break;
            case 11:
                System.out.println("Çin zodyaği burcunuz: Koyun");
                break;
            default:
                System.out.println("Gecersiz giris yaptiniz...");
                break;
        }





    }
}
