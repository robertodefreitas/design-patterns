package dp.factory.family;

import dp.factory.interfaces.MahlzeitFabrik;
import dp.factory.interfaces.Getraenk;
import dp.factory.interfaces.Vorspeise;
import dp.factory.interfaces.Hauptgericht;
import dp.factory.product.Kartoffelgratin;
import dp.factory.product.Saft;
import dp.factory.product.Suppe;

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
}
