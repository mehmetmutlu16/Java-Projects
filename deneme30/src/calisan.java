public class calisan {
    private String ad;
    private String soyad;
    private int id;

    public calisan(String ad, String soyad, int id){
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    public String getAd(){
        return ad;
    }

    public void setAd(String ad){
        this.ad = ad;
    }

    public String getSoyad(){
        return soyad;
    }

    public void setSoyad(String soyad){
        this.soyad = soyad;
    }

    public int id(){
        return id;
    }

    public void id(int id){
        this.id = id;
    }

    public void bilgilerigoster(){
        System.out.println("Calisanin Bilgileri......");
        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyad);
        System.out.println("ID: "+id);
    }
}
