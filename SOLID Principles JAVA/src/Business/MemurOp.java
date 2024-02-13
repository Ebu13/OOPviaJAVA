package Business;

import Entities.Personel;

public class MemurOp implements PersonelGeneralOperation{

    public Personel _memur;
    public MemurOp(Personel personel){
        _memur=personel;
    }
    @Override
    public void isimdegistir(String yenisim) {
        _memur.setAd(yenisim);
    }

    @Override
    public String adsoyadgetir() {
        return _memur.getAd()+" "+_memur.getSoyad();
    }
}
