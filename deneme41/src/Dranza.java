public class Dranza extends Beyblade{

    private String kutsalCanavar;
    public Dranza(String beybladeci, int donusHizi, int saldırıGucu, String kutsalCanavar){
        super(beybladeci,donusHizi,saldırıGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kutsal canavarin adi: " + kutsalCanavar);
    }

    @Override
    public void kutsalcanavariortayacikar(){
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'i ortaya cikariyor...");
        System.out.println(getBeybladeci() + "'in Saldirisi: Alev Kilici");
    }
}
