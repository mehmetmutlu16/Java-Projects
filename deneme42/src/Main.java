import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String a = "Mehmet";

        String b = new String("Mehmet");

        System.out.println(b);

        System.out.println("Harf sayisi: "+ b.length());

        System.out.println("0.indeksi: "+ b.charAt(0));
        System.out.println("1.indeksi: "+ b.charAt(1));
        System.out.println("2.indeksi: "+ b.charAt(2));
        System.out.println("3.indeksi: "+ b.charAt(3));
        System.out.println("4.indeksi: "+ b.charAt(4));
        System.out.println("5.indeksi: "+ b.charAt(5));

        System.out.println(b.startsWith("Me"));
        System.out.println(b.startsWith("Mu"));

        System.out.println(b.endsWith("et"));
        System.out.println(b.endsWith("at"));

        System.out.println(b.toLowerCase(Locale.ROOT));
        System.out.println(b.toUpperCase(Locale.ROOT));

        String c = "1907";
        int d = Integer.parseInt(c);
        System.out.println(d);

        int b1 = 1923;
        String a1 = String.valueOf(b1);
        System.out.println(a1);
    }
}
