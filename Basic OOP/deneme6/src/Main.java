import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Kapsülleme için yapıldı.
        BankaHesabi bankaHesabi1=new BankaHesabi(5000,"434569");
        BankaHesabi bankaHesabi2=new BankaHesabi(400,"31654");
        bankaHesabi1.parayatir(50);
        bankaHesabi2.paracek(350);
        System.out.println(bankaHesabi1.getBakiye()+"  "+bankaHesabi2.getBakiye());
        bankaHesabi2.paracek(400);
    }
}
