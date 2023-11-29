public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldırıGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldırıGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adi: "+ kutsalCanavar);
        System.out.println("Gizli Yetenek: "+ gizliYetenek);
    }

    @Override
    public void kutsalcanavariortayacikar(){
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'i ortaya cikariyor...");
        System.out.println(getBeybladeci() + "'in Saldirisi: Hayalet Kasirgasi");
    }
}
