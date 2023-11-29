public class anakart {

    private String model;
    private String uretici;
    private int yuva_sayisi;
    private String isletimsistemi;

    public anakart(String model, String uretici, int yuva_sayisi, String isletimsistemi){
        this.model = model;
        this.uretici = uretici;
        this.yuva_sayisi = yuva_sayisi;
        this.isletimsistemi = isletimsistemi;
    }

    public void isletimsistemiyukle(String isletimsistemi){
        this.isletimsistemi = isletimsistemi;

        System.out.println("Isletim Sistemi Basariyla Yuklendi: "+isletimsistemi);
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getUretici(){
        return uretici;
    }

    public void setUretici(String uretici){
        this.uretici = uretici;
    }

    public int getYuva_sayisi(){
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi){
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getIsletimsistemi(){
        return isletimsistemi;
    }

    public void setIsletimsistemi(String isletimsistemi){
        this.isletimsistemi = isletimsistemi;
    }

}
