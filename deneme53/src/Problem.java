public class Problem {

    public static class Matematik{

        public static void daireAlan(int yaricap){
            System.out.println("Dairenin alani: " + (yaricap * yaricap * Math.PI));
        }

        public static void ucgenCevresi(int kenar1, int kenar2, int kenar3){
            System.out.println("Ucgenin cevresi: " + (kenar1 + kenar2 + kenar3));
        }
    }

    public static class Fizik{

        public static void icCarpim(Vector vec1, Vector vec2){
            int icCarpim = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + "'in ic carpimi: " + icCarpim);
        }
    }
}
