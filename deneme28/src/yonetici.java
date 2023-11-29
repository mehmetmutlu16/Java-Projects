public class yonetici extends calisan{

    private int sorumlu_kisi;

    public yonetici(String isim, int maas, String departman, int sorumlu_kisi){
        /*this.isim = isim;
        this.maas = maas;
        this.departman = departman;*/
        super(isim,maas,departman);

        this.sorumlu_kisi = sorumlu_kisi;
    }

    public void zam_yap(int zam_miktari){

        System.out.println("Calisanlara "+zam_miktari+" TL zam yapildi.");

    }

    public void bilgilerigoster(){

        /*System.out.println("Isim: "+getIsim());
        System.out.println("Maas: "+getMaas());
        System.out.println("Departman: "+getDepartman());*/

        super.bilgilerigoster();

        System.out.println("Sorumlu oldugu kisi sayisi: "+ this.sorumlu_kisi);

    }
}
