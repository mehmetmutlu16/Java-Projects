public class kare extends Sekil{

    private int kenar;

    public kare(String isim, int kenar){
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + " alani " + (kenar*kenar) + "'dir.");
    }
}
