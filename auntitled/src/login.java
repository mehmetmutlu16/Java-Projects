import java.util.Scanner;

public class login {

    public boolean login(hesap hesap){

        Scanner scanner = new Scanner(System.in);

        String kullanici_adi;
        String parola;

        System.out.println("Kullanici adi: ");
        kullanici_adi = scanner.nextLine();

        System.out.println("Parola: ");
        parola = scanner.nextLine();

        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){

            return true;
        }
        else{
            return false;
        }


    }

}
