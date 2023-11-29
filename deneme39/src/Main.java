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
    public static void konustur(Hayvan hayvan10){
        System.out.println(hayvan10.konus());
    }

    public static void main(String[] args) {
        Hayvan hayvan1 = new Hayvan("Limon");
        System.out.println(hayvan1.konus());
        Hayvan hayvan2 = new kedi("Tekir");
        System.out.println(hayvan2.konus());
        Hayvan hayvan3 = new kopek("Dost");
        System.out.println(hayvan3.konus());
        Hayvan hayvan4 = new at("Sahbatur");
        System.out.println(hayvan4.konus());

        konustur(new kedi("Tekir2"));
        konustur(new kopek("Karabas"));
        konustur(new at("Sahbatur2"));
    }
}
