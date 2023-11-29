public class Sebze extends Yiyecek{

    public Sebze(String isim, String renk, String yetistigiYer){
        super(isim,renk,yetistigiYer);
        setYetistigiYer("Toprak");
    }

    @Override
    void YiyecekTuru() {
        System.out.println("Sebze");
    }
}
