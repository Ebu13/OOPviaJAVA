import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        YuksekLisans yuksekLisanscetin=new YuksekLisans("Cetin Ercelik",32,"31489685436","Yazılım Mühendisliği","Mühendislik","Selman Yakut","Malatya");
        YuksekLisans yuksekLisanshuseyin=new YuksekLisans("Hüseyin Enes Okutan",37,"15487854216","Yazılım Mühendisliği","Mühendislik","Fatih Okumuş","Malatya");
        Lisans beststudent=new Lisans("Ebubekir Sıddık Nazlı",20,"22204745695","Yazılım Mühendisliği",3,"Diyarbakır");
        Lisans gundi=new Lisans("Bodur Tırrek",21,"31173145631","Yazılım Mühendisliği",3,"Van");
        Lisans hain=new Lisans("Takıntılı Kıskanç",21,"45699911156","Yazılım Mühendisliği",3,"Van");

        List<Ogrenci> ogrenciList=new ArrayList<>();
        ogrenciList.add(yuksekLisanscetin);
        ogrenciList.add(yuksekLisanshuseyin);
        ogrenciList.add(beststudent);
        ogrenciList.add(gundi);
        ogrenciList.add(hain);
        System.out.println("Ogrenciler:\n");
        for (Ogrenci i : ogrenciList){
            System.out.println(i.Name_Surname);
        }
    }
}