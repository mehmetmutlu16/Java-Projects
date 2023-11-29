import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tutar giriniz: ");
        double tutar= scanner.nextDouble();

        if (tutar<=1000){
            tutar=(tutar*1.18);
        }
        else if (tutar>1000){
            tutar=tutar*1.08;
        }

        System.out.println("KDV'li tutar: "+tutar);
    }
}
