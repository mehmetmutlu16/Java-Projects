public class test {
    public static void main(String[] args) {
        account account1 = new account();

        account account2 = new account("123456",1000,"Mehmet","example@gmail.com","5555555555");

        account2.ParaYatir(500);

        System.out.println(account1.getEmail());
    }
}
