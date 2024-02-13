//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba");
        Kutuphane kutuphanem=new Kutuphane();
        kutuphanem.kitapEkle(new Book("Sefiller","Victor Hugo"));
        kutuphanem.kitapEkle(new Book("Kuyucaklı Yusuf","Sebahattin Ali"));
        kutuphanem.kitapEkle(new Book("Kavgam","Adolf H."));
        kutuphanem.listele();
        System.out.println("  ");
        kutuphanem.kitapSil(kutuphanem.kitaplar.get(1));
        kutuphanem.listele();
        }
}