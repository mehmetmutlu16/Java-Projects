public class Test {
    public static void main(String[] args) {
        resolution resolution1 = new resolution(1920,1080);

        monitor monitor1 = new monitor("VS197DE","ASUS","18.5",resolution1);

        kasa kasa1 = new kasa("Shadow Blade", "Shadow", "Temperli Cam");

        anakart anakart1 = new anakart("B250-PRO","ASUS",10,"WİNDOWS 10");

        bilgisayar pc = new bilgisayar(monitor, kasa, anakart);

        pc.getKasa();
    }
}
