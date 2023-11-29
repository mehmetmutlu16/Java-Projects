public class daire extends Sekil{

    private int yaricap;

    public daire(String isim, int yaricap){
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + " alani " + (Math.PI*yaricap*yaricap));
    }
}
