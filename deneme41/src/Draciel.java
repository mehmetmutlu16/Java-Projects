public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String beybladeci, int donusHizi, int saldırıGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldırıGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adi: "+ kutsalCanavar);
    }

    @Override
    public void kutsalcanavariortayacikar(){
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'i ortaya cikariyor...");
        System.out.println(getBeybladeci() + "'in Savunmasi: Kale Savunmasi");
    }
}
