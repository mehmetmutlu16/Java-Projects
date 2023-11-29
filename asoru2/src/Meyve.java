public class Meyve extends Yiyecek{
    public Meyve(String isim,String renk,String yer){
        super(isim,renk,yer);
        setYer("agacta yetisir");

    }

    public String YiyecekTuru(){
        return "meyve";
    }

}
