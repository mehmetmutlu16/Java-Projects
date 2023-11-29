public class Main {
    public static void main(String[] args) {
        /*calisan c1 = new ogretmen("ali",1);
        ogretmen c2 = (ogretmen)c1;
        c2.calisma();*/
        ogretmen o1 = new ogretmen("Ali",10);
        calisan calisan1 = o1;
        o1.calisma();
        calisan1.calisma();

        calisan[] array = new calisan[10];
        for(int i=0; i<array.length; i++){
            System.out.println(calisan[i]);
        }
    }
}
