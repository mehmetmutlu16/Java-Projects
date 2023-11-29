import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        yarisma yarisma1 = new yarisma();
        Random rnd = new Random();

        int rndtavsan;
        int rndkaplumbaga;

        while(yarisma.getBitti()){
            rndkaplumbaga = 1+rnd.nextInt(10);
            rndtavsan = 1+rnd.nextInt(10);

            System.out.println("TK___________________\n\n");
            yarisma.kaplumbagaHareket(rndkaplumbaga);
            yarisma.tavsanHareket(rndtavsan);
        }
    }
}