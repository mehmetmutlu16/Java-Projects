public class BBank extends Banka{
    String isim;
    double faizOrani;

    public BBank(String isim, double faizOrani){
        this.isim = isim;
        this.faizOrani = faizOrani;
    }

    @Override
    void faizHesapla(int deger) {
        double sonuc = deger + faizOrani*deger;
        System.out.println(sonuc);
    }
}
