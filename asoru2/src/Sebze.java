public class Sebze extends Yiyecek{
    public Sebze(String isim,String renk,String yer){
        super(isim,renk,yer);
        setYer("toprakta yetisir");

    }

    public String YiyecekTuru(){
        return "sebze";
    }

}
