public class account {

    private String hesapNo;
    double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    public account(){

        /* this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.isim = "Bilgi yok";
        this.email = "Bilgi yok";
        this.telefonNo = "Bilgi yok"; */

        this("Bilgi yok",0.0,"Bilgi yok","Bilgi yok","Bilgi yok");

        //System.out.println("Kendi yazdigimiz constructor");
    }

    public account(String hesapNo,double bakiye, String isim, String email, String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }

    public void ParaYatir(double miktar){
        bakiye+= miktar;

        System.out.println("Yeni Bakiye: "+bakiye);

    }

    public void ParaCek(double miktar) {
        if (miktar > 1500) {
            System.out.println("Bir günde 1500 tldenn fazla paraçekemezsiniz...");
        }
        if (bakiye < miktar) {
            System.out.println("Yeterli bakiye yok. Guncel bakiyeniz: " + bakiye);
        }
        else{
            bakiye -= miktar;
            System.out.println("Yeni bakiye: " + bakiye);
        }

    }
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public String getHesapNo() {
        return hesapNo;
    }
}
