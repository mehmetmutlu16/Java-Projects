import java.util.Scanner;

public class Main {
    public static void mekanKontrol(int yas){
        if(yas < 18){
            throw new ArithmeticException();
        }
        else{
            System.out.println("Mekana hosgeldiniz...");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scanner.nextInt();

        try{
            mekanKontrol(yas);
        }
        catch (ArithmeticException e){
            System.out.println("18 Yasindan kucukler mekana giremez!!!");
        }
    }
}
