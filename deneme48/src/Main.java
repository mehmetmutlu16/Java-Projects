public class Main {
    public static void main(String[] args) {

        PCMuh mehmet = new PCMuh(false,false);

        mehmet.adliSicil();
        mehmet.askerlikDurumu();
        System.out.println(mehmet.mezuniyetOrt(3.09));
        String[] tecrube = {"Google","Microsoft","Apple"};
        mehmet.isTecrubesi(tecrube);

    }
}
