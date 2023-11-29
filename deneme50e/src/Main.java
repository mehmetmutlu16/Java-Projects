public class Main {
    public static void main(String[] args) {
        Sebze Lahana = new Sebze("Lahana","Kırmızı","");
        Meyve Elma = new Meyve("Elma","Yeşil","");

        Yiyecek.Yazdir(Elma);
        System.out.println(Elma.getIsim() + "'nın yetistigi yer: " + Elma.getYetistigiYer());
        System.out.println("");
        Yiyecek.Yazdir(Lahana);
        System.out.println(Lahana.getIsim() + "'nın yetistigi yer: " + Lahana.getYetistigiYer());
    }
}
