public class MutluParti implements Parti{
    int oysayisi = 0;

    @Override
    public void partiIsim() {
        System.out.println("Partimizin ismi -MutluParti- ");
    }

    @Override
    public void adaylar() {
        System.out.println("Adaylarimiz:\n" +
                "Cumhurbaskani adayi: Sefa Mutlu\n" +
                "Basbakanlik adayi: Mehmet Mutlu");
    }
}