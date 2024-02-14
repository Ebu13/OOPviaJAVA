public class BankaHesabi {
    private int bakiye;
    private String hesapnumarasi;

    public BankaHesabi(int bakiye,String hesapnumarasi){
        this.bakiye=bakiye;
        this.hesapnumarasi=hesapnumarasi;
    }

    public void parayatir(int yatirilanpara){
        bakiye+=yatirilanpara;
    }

    public void paracek(int cekilenpara){
        if (cekilenpara>bakiye){
            System.out.println("Yetersiz Bakiye");
        }else {
            bakiye-=cekilenpara;
        }
    }

    public int getBakiye(){
        return this.bakiye;
    }
    public String getHesapnumarasi(){
        return this.hesapnumarasi;
    }
}
