public class Ogretmen extends Calisan{

    public Ogretmen(String isim, int maas){
        super(isim,maas);
      }

    @Override
    public void calisma(){
        System.out.println(this.isim + " Ogretmen calisiyor...");
    }
}
