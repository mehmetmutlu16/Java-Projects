public abstract class Yiyecek {

    private String isim;
    private String renk;
    private String yetistigiYer;

    public Yiyecek(String isim,String renk, String yetistigiYer){
        this.isim = isim;
        this.renk = renk;
        this.yetistigiYer = yetistigiYer;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getRenk() {
        return renk;
    }

    public void setYetistigiYer(String yetistigiYer) {
        this.yetistigiYer = yetistigiYer;
    }

    public String getYetistigiYer() {
        return yetistigiYer;
    }

    abstract void YiyecekTuru();

    static void Yazdir(Yiyecek isim){
        if(isim instanceof Meyve){
            System.out.println(isim.getIsim() + " bir meyvedir...");
        }
        else{
            System.out.println(isim.getIsim() + " bir sebzedir...");
        }
    }

}
