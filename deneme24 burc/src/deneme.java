import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dogdugunuz ayi giriniz: ");
        int ay= scanner.nextInt();
        System.out.println("Dogdugunuz gunu giriniz: ");
        int gun= scanner.nextInt();

        switch (ay){
            case 1:
                if (gun>=1 && gun<=31){
                    if (gun<22){
                        System.out.println("Oglak burcu");
                    }
                    else{
                        System.out.println("Kova burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 2:
                if (gun>=1 && gun<=28){
                    if (gun<=   19){
                        System.out.println("Kova burcu");
                    }
                    else{
                        System.out.println("Balik burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 3:
                if (gun>=1 && gun<=31){
                    if (gun<=20){
                        System.out.println("Balik burcu");
                    }
                    else{
                        System.out.println("Koc Burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 4:
                if (gun>=1 && gun<=30){
                    if (gun<=20){
                        System.out.println("Koc burcu");
                    }
                    else{
                        System.out.println("Boga burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 5:
                if (gun>=1 && gun<=31){
                    if (gun<=21){
                        System.out.println("Boga burcu");
                    }
                    else {
                        System.out.println("Ikizler burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 6:
                if (gun>=1 && gun<=30){
                    if (gun<=22){
                        System.out.println("Ikizler burcu");
                    }
                    else{
                        System.out.println("Yengec burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 7:
                if (gun>=1 && gun<=31){
                    if (gun<=23){
                        System.out.println("Yengec burcu");
                    }
                    else{
                        System.out.println("Aslan burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 8:
                if (gun>=1 && gun<=31){
                    if (gun<=23){
                        System.out.println("Aslan burcu");
                    }
                    else{
                        System.out.println("Basak burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 9:
                if (gun>=1 && gun<=30){
                    if (gun<=22){
                        System.out.println("Basak burcu");
                    }
                    else{
                        System.out.println("Terazi burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 10:
                if (gun>=1 && gun<=31){
                    if (gun<=22){
                        System.out.println("Terazi burcu");
                    }
                    else{
                        System.out.println("Akrep burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 11:
                if (gun>=1 && gun<=30){
                    if (gun<=21){
                        System.out.println("Akrep burcu");
                    }
                    else{
                        System.out.println("Yay burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;

            case 12:
                if (gun>=1 && gun<=31){
                    if (gun<=21){
                        System.out.println("Yay burcu");
                    }
                    else{
                        System.out.println("Oglak burcu");
                    }
                }
                else{
                    System.out.println("Gecersiz giris yaptiniz!!!");
                }
                break;
        }
    }
}
