package Business;

import Entities.Personel;

public class MuhasebeOp implements PersonelGeneralOperation{

    public Personel _muhasebeci;

    public MuhasebeOp(Personel personel){
        _muhasebeci=personel;
    }
    @Override
    public void isimdegistir(String yenisim) {
        _muhasebeci.setAd(yenisim);
    }

    @Override
    public String adsoyadgetir() {
        return _muhasebeci.getAd()+" "+_muhasebeci.getSoyad();
    }
}
