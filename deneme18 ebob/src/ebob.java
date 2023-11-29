import java.util.Scanner;

public class ebob {
    public static int ebob(int sayi1,int sayi2){
        int ebob=1;
        for (int i=1;i<=sayi1 && i<=sayi2;i++){
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz:");
        int sayi1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ikinci sayiyi giriniz:");
        int sayi2 = scanner.nextInt();

        System.out.println("Iki sayinin ebobu = " + ebob(sayi1,sayi2));
    }
}
