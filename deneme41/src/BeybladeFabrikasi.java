public class BeybladeFabrikasi {
    public Beyblade beybladeuret(String beybladeturu){

        if (beybladeturu.equals("Dragon")){
            return new Dragon("Takao",800,300,"Mavi Ejderha","Kutsal Cavanarla Konusma");
        }
        else if (beybladeturu.equals("Dranza")){
            return new Dranza("Kai", 600,400,"Kirmizi Anka Kusu");
        }
        else if (beybladeturu.equals("Drayga")){
            return new Drayga("Rei",800,250,"Beyaz Kaplan");
        }
        else if (beybladeturu.equals("Draciel")){
            return new Draciel("Max",400,1000,"Kara Kaplumbaga");
        }
        else{
            return null;
        }
    }
}
