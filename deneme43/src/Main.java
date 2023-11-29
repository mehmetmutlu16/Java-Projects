package random;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random(); //random sınıfı
        int a = r.nextInt(10);

        int b = r.nextInt(10);

        tavsan t1 = new tavsan(a);

    }
}