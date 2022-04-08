package dp.factory.restaurant;

import dp.factory.interfaces.MahlzeitFabrik;
import dp.factory.interfaces.Getraenk;
import dp.factory.interfaces.Vorspeise;
import dp.factory.interfaces.Hauptgericht;
import dp.factory.restaurant.Kartoffelgratin;
import dp.factory.restaurant.Saft;
import dp.factory.restaurant.Suppe;

public class RestaurantFabrik implements MahlzeitFabrik {
    // eine konkrete Familie/Fabrik
    
    @Override
    public Getraenk createGetraenk() {
        return new Saft();
    }

    @Override
    public Vorspeise createVorspeise() {
        return new Suppe();
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
