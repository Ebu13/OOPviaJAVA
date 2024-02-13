import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    public List<Book> kitaplar= new ArrayList<>();

    public void kitapEkle(Book kitap){
        kitaplar.add(kitap);
    }
    public void kitapSil(Book kitap){
        for (int i=0;i< kitaplar.size();i++){
            Book mevcutkitap=kitaplar.get(i);
            if (mevcutkitap.getBookName()==kitap.getBookName()){
                kitaplar.remove(i);
            }
        }
    }
    public void listele(){
        for (Book i:kitaplar){
            System.out.println(i.getBookName()+"  "+i.getYazar());
        }
    }
}
