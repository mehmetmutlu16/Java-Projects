public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();

        hesap hesap = new hesap("Mehmet Mutlu","123456",2000);

        atm.calis(hesap);

    }
}
