import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("Cikis icin q'ya basiniz...");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hangi beyblade'i uretmek istiyorsunuz?");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();

                Beyblade beyblade = fabrika.beybladeuret(islem);

                if(beyblade == null){
                    System.out.println("Lutfen gecerli bir beyblade giriniz...");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldır();
                    beyblade.kutsalcanavariortayacikar();
                }

            }
        }

    }
}
