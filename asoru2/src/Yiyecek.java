abstract class Yiyecek{
    private String isim;
    private String renk;
    private String yer;

    public Yiyecek(String isim,String renk,String yer){
        this.isim=isim;
        this.renk=renk;
        this.yer=yer;
    }

    public void setIsim(String isim){
        this.isim=isim;
    }
    public void setRenk(String renk){
        this.renk=renk;
    }
    public void setYer(String yer){
        this.yer=yer;
    }



    public String getIsım(){
        return isim;
    }
    public String getRenk(){
        return renk;
    }
    public String getYer(){
        return yer;
    }

    public String YiyecekTuru(){
        return "belirsiz";
    }


    static void Yazdir(Yiyecek isim){
        if(isim instanceof Meyve){
            System.out.println("elma bir meyvedir");
        }
        else if(isim instanceof Sebze){
            System.out.println("kırmızı lahana bir sebzedir");
        }
    }
}
