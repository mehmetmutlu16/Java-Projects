public class Main
{
    public static void main(String[] args) {
        Meyve m1=new Meyve("elma","yeşil renklidir","");
        m1.YiyecekTuru();
        Yiyecek.Yazdir(m1);
        System.out.println(m1.getIsım()+" "+m1.getRenk()+" "+m1.getYer());

        Sebze s1=new Sebze("lahana","kırmızı renklidir","");
        s1.YiyecekTuru();
        Yiyecek.Yazdir(s1);
        System.out.println(s1.getIsım()+" "+s1.getRenk()+" "+s1.getYer());


    }
}
