package dp.factory.family;

import dp.factory.interfaces.MahlzeitFabrik;
import dp.factory.interfaces.Getraenk;
import dp.factory.interfaces.Vorspeise;
import dp.factory.interfaces.Hauptgericht;
import dp.factory.product.Pizza;
import dp.factory.product.Salat;
import dp.factory.product.Wasser;

public class PizzeriaFabrik implements MahlzeitFabrik {
    // eine konkrete Familie/Fabrik

    @Override
    public Getraenk createGetraenk() {
        return new Wasser();
    }

    @Override
    public Vorspeise createVorspeise() {
        return new Salat();
    }

    @Override
    public Hauptgericht createHauptgericht() {
        return new Pizza();
    }


//    @Override
//    public Wasser createGetraenk() {
//        return new Wasser();
//    }
//
//    @Override
//    public Salat createVorspeise() {
//        return new Salat();
//    }
//
//    @Override
//    public Pizza createHauptgericht() {
//        return new Pizza();
//    }
}
