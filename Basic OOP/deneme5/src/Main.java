
public class Main {
    public static void main(String[] args) {
        Sekil sekil1 = new Daire();
        Sekil sekil2 = new Kare();

        sekil1.ciz();
        sekil2.ciz();
        //(Late binding) bir nesnenin hangi metotunun çağrılacağının çalışma zamanında belirlenmesini ifade eder.
    }
}
