import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void listeyiBastir(LinkedList<String> gidilecekYerler){
        /*for (String s: gidilecekYerler){
            System.out.println(s);
        }*/

        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void main(String[] args) {

        LinkedList<String> gidilecekYerler = new LinkedList<String>();

        gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kutuphane");
        gidilecekYerler.add("Spor Salonu");
        gidilecekYerler.add("Ev");

        listeyiBastir(gidilecekYerler);

        System.out.println("------------------");

        gidilecekYerler.add(4,"Alısveris Merkezi");

        listeyiBastir(gidilecekYerler);
    }
}
