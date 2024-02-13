package Business;

import Entities.ManagerPersonel;

public class ManagerOp implements PersonelGeneralOperation{
    public ManagerPersonel _manager;
    public ManagerOp(ManagerPersonel manager){
        this._manager=manager;
    }
    public void isimdegistir(String yenisim) {
        _manager.setAd(yenisim);
    }

    public String adsoyadgetir() {
        return (_manager.getAd()+" "+_manager.getSoyad());
    }
}
