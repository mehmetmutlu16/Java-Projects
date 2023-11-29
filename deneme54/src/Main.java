public class Main {
    public static void main(String[] args) {
        Calisan deneme3 = new Calisan("deneme",3000);
        Ogretmen deneme2 = (Ogretmen) Calisan;


        deneme2.calisma();
        deneme3.calisma();


    }
}
