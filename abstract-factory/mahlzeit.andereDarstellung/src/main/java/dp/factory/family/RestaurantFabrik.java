package dp.factory.family;

import dp.factory.interfaces.MahlzeitFabrik;
import dp.factory.interfaces.Getraenk;
import dp.factory.interfaces.Vorspeise;
import dp.factory.interfaces.Hauptgericht;
import dp.factory.product.Kartoffelgratin;
import dp.factory.product.Saft;
import dp.factory.product.Salat;
import dp.factory.product.Suppe;

public class RestaurantFabrik implements MahlzeitFabrik {
    // eine konkrete Familie/Fabrik
    
    @Override
    public Getraenk createGetraenk() {
        return new Saft();
    }

    @Override
    //public Vorspeise createVorspeise() { return new Suppe(); }
    public Vorspeise createVorspeise() {
        return new Salat();
    }

    @Override
    public Hauptgericht createHauptgericht() {
        return new Kartoffelgratin();
    }



//    @Override
//    public Saft createGetraenk() {
//        return new Saft();
//    }
//
//    @Override
//    public Suppe createVorspeise() {
//        return new Suppe();
//    }
//
//    @Override
//    public Kartoffelgratin createHauptgericht() {
//        return new Kartoffelgratin();
//    }
}
