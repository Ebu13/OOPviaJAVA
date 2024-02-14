public abstract class Ucgen implements Matematik{
    public static double alanhesapla(int kenar1,int kenar2,int kenar3) {
        double yariCevre = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) * (yariCevre - kenar3));
        return alan;
    }
}
