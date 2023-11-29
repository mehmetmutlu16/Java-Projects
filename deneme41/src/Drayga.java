public class Drayga extends Beyblade{
    private String kutsalcanavar;

    public Drayga(String beybladeci, int donusHizi, int saldırıGucu, String kutsalCanavar){
        super(beybladeci, donusHizi, saldırıGucu);
        this.kutsalcanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi: "+ kutsalcanavar);
    }

    @Override
    public void kutsalcanavariortayacikar(){
        System.out.println(getBeybladeci() + " " + kutsalcanavar + "'i ortaya cikariyor...");
        System.out.println(getBeybladeci() + "'in Saldirisi: Kaplan Pencesi");
    }
}
