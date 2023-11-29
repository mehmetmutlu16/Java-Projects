public class Meyve extends Yiyecek{

    public Meyve(String isim, String renk, String yetistigiYer){
        super(isim,renk,yetistigiYer);
        setYetistigiYer("Ağaç");
    }

    @Override
    void YiyecekTuru() {
        System.out.println("Meyve");
    }
}
