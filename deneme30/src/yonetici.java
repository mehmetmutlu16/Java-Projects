public class yonetici extends calisan{
    private int sorumlukisisayisi;

    public yonetici(String ad, String soyad, int id, int sorumlukisisayisi){
        super(ad,soyad,id);
        this.sorumlukisisayisi = sorumlukisisayisi;
    }

    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi: "+sorumlukisisayisi);
    }

    public void zamyap(int zammiktari){
        System.out.println(getAd()+" calisanlara "+ zammiktari + "kadar zam yapiyor...");
    }

}
