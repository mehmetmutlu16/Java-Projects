public class cember {
    private int yaricap;
    private String renk;

    public cember(int yaricap, String renk){
        this.yaricap = yaricap;
        this.renk = renk;
    }

    public int getYaricap(){
        return yaricap;
    }

    public void setYaricap(int yaricap){
        this.yaricap = yaricap;
    }

    public String getRenk(){
        return renk;
    }

    public void setRenk(String renk){
        this.renk = renk;
    }

    public static double alan(int yaricap){
        double alan = (3.14)*yaricap*yaricap;
        System.out.println("Cemberin alani: "+alan);
        return alan;
    }

    public static double cevre(int yaricap){
        double cevre = 2*(3.14)*yaricap;
        System.out.println("Cemberin cevresi: "+cevre);
        return cevre;
    }

    public static void renk(String renk){
        System.out.println("Cemberin rengi: "+renk);
    }
}
