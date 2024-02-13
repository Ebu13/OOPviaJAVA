import Business.ManagerOp;
import Entities.ManagerPersonel;
import Entities.MemurPersonel;
import Entities.MuhasebePersonel;
import Entities.Personel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personel> personels=new ArrayList<>();
        personels.add(new MuhasebePersonel("Ebubekir Sıddık","Nazlı"));
        personels.add(new MemurPersonel("Mehmet","Nazlı"));
        personels.add(new ManagerPersonel("Mehmet Ali","Alabora"));
        ManagerOp managerOp1=new ManagerOp((ManagerPersonel) personels.get(2));
        for (Personel personel: personels){
            System.out.println(personel.getAd());
        }
        System.out.println("\n"+managerOp1.adsoyadgetir());
        managerOp1.isimdegistir("Mahmut");
        System.out.println(managerOp1.adsoyadgetir());
    }
}