public class PCMuh implements IMuhendis{
    private boolean askerlik;
    private boolean adliSicil;

    public PCMuh(boolean askerlik, boolean adliSicil){
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    public void askerlikDurumu(){
        if(askerlik){
            System.out.println("Askerlik Yapildi...");
        }
        else{
            System.out.println("Askerlik Yapilmadi...");
        }
    }

    @Override
    public String mezuniyetOrt(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adliSicil() {
        if(adliSicil){
            System.out.println("Adli Sicil Kaydim Bulunuyor...");
        }
        else{
            System.out.println("Adli Sicil Kaydim Bulunmuyor...");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar Muhendisi Olarak Su Sirketlerde Calistim: ");

        for(int i=0;i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
