class Hayvan{
    private String isim;

    public Hayvan(String isim){
        this.isim=isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim){
        this.isim=isim;
    }

    public String konus(){
        return "Hayvan konusuyor...";
    }
}

class kedi extends Hayvan{
    public kedi(String isim){
        super(isim);
    }
    public String konus(){
        return this.getIsim() + " miyavlıyor...";
    }
}

class kopek extends Hayvan{
    public kopek(String isim){
        super(isim);
    }
    public String konus() {
        return this.getIsim() + " havlıyor...";
    }
}

class at extends Hayvan{
    public at(String isim){
        super(isim);
    }
    public String konus(){
        return this.getIsim() + " kisniyor...";
    }
}


public class Main {
    public static void konustur(Object object){
        if (object instanceof kopek){
            kopek kopek =(kopek) object;
            System.out.println(kopek.konus());
        }
        else if (object instanceof kedi){
            kedi kedi=(kedi) object;
            System.out.println(kedi.konus());
        }
        else if (object instanceof at){
            at at=(at) object;
            System.out.println(at.konus());
        }
        else if (object instanceof Hayvan){
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        }
    }

    public static void main(String[] args) {
        kopek kopek = new kopek("Karabas");
        kedi kedi = new kedi("Tekir");
        at at = new at("Sahbatur");
        Hayvan hayvan = new Hayvan("Limon");
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
    }
}
