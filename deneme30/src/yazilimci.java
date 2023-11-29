public class yazilimci extends calisan{

    private String diller;

    public yazilimci(String ad, String soyad, int id, String diller){
        super(ad,soyad,id);
        this.diller = diller;
    }

    public void formatat(String isletimsistemi){
        System.out.println(getAd()+""+isletimsistemi+"ni yukluyor...");
    }

    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("Yazilimcinin bildigi diller: "+diller);
    }
}
