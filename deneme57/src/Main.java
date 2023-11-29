import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean bitis = true;
        Scanner scanner = new Scanner(System.in);

        MutluParti m1 = new MutluParti();
        KumcuParti k1 = new KumcuParti();

        System.out.println("  ---Secim Uygulamamiza Hosgeldiniz---");
        System.out.println("---Simdi Partilerimizin Tanitimini Gorelim---");
        System.out.println("*********************************************");
        m1.partiIsim();
        m1.adaylar();
        System.out.println("*********************************************");
        k1.partiIsim();
        k1.adaylar();
        System.out.println("*********************************************");
        while(bitis) {
            System.out.println("MutluPartisi: " + m1.oysayisi);
            System.out.println("KumcuPartisi: " + k1.oysayisi);
            System.out.println("*********************************************");
            Secmen.secmen();
            System.out.println("--- Sayın " + Secmen.isim +" aday partilerden oy vermek istediginiz parti icin 'M' veya 'K' yaziniz---");
            String secim = scanner.nextLine();
            if (secim.equals("k") || secim.equals("K")){
                k1.oysayisi +=1;
            }
            else if (secim.equals("m") || secim.equals("M")){
                m1.oysayisi +=1;
            }
            else{
                System.out.println("Gecersiz bir giris yaptinin!!!");
            }

            if(m1.oysayisi>20){
                System.out.println("Secimi MutluParti kazanmistir. Oylariniz icin tesekkür ederiz...");
                bitis = false;
            }
            else if(k1.oysayisi>20){
                System.out.println("Secimi KumcuParti kazanmistir. Oylariniz icin tesekkür ederiz...");
                bitis= false;
            }
        }
    }
}