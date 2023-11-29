import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen vize notunuzu giriniz: ");
        int vize1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Lutfen ikinci vize notunuzu giriniz: ");
        int vize2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Lutfen final notunuzu giriniz: ");
        int final1 = scanner.nextInt();
        scanner.nextLine();

        double ort = final1*0.5+vize1*0.25+vize2*0.25;

        if (ort<=100 && ort>=90){
            System.out.println("AA aldiniz "+ ort);
        }
        else if (ort<90 && ort>=85){
            System.out.println("BA aldiniz "+ ort);
        }
        else if (ort<85 && ort>=80){
            System.out.println("BB aldiniz "+ ort);
        }
        else if (ort<80 && ort>=75){
            System.out.println("CB aldiniz "+ ort);
        }
        else if (ort<75 && ort>=70){
            System.out.println("CC aldiniz "+ ort);
        }
        else if (ort<70 && ort>=50){
            System.out.println("DD aldiniz "+ort);
        }
        else if (ort<50){
            System.out.println("FF aldiniz ve kaldiniz "+ ort);
        }




    }
}
