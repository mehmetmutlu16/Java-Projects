public class ABank extends Banka{
    String isim;
    double faizOrani;

    public ABank(String isim, double faizOrani){
        this.isim = isim;
        this.faizOrani = faizOrani;
    }

    @Override
    void faizHesapla(int deger) {
        double sonuc = deger + faizOrani*deger;
        System.out.println(sonuc);
    }
}
