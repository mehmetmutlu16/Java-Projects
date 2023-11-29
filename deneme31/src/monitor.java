public class monitor {

    private String model;
    private String uretici;
    private String boyut;
    private resolution resolution1;

    public monitor(String model, String uretici, String boyut, resolution resolution1){
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution1= resolution1;
    }

    public void monitorukapat(){
        System.out.println("Monitor kapatiliyor...");
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

    public String getBoyut(){
        return boyut;
    }

    public void setBoyut(String boyut){
        this.boyut = boyut;
    }

    public resolution getResolution1(){
        return resolution1;
    }

    public void setResolution1(resolution resolution1){
        this.resolution1 = resolution1;
    }


}
