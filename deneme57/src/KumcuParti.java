public class KumcuParti implements Parti{
    int oysayisi = 0;

    @Override
    public void partiIsim() {
        System.out.println("Partimizin ismi -KumcuParti- ");
    }

    @Override
    public void adaylar() {
        System.out.println("Adaylarimiz:\n" +
                "Cumhurbaskani adayi: Ufuk Can Kumcu\n" +
                "Basbakan adayi: Umut Can Kumcu");
    }
}