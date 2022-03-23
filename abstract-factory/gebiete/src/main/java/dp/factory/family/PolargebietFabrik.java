package dp.factory.family;

import dp.factory.interfaces.AbstrakteGebietfabrik;
import dp.factory.interfaces.Pflanze;
import dp.factory.interfaces.Tier;
import dp.factory.interfaces.Untergrund;
import dp.factory.product.Eisbaer;
import dp.factory.product.Flechte;
import dp.factory.product.Schnee;

public class PolargebietFabrik implements AbstrakteGebietfabrik {

    @Override
    //public Flechte createPflanze() { return new Flechte(); }
    public Pflanze createPflanze() {
        return new Flechte();
    }

    @Override
    //public Eisbaer createTier() { return new Eisbaer(); }
    public Tier createTier() {
        return new Eisbaer();
    }

    @Override
    //public Schnee createUntergrund() { return new Schnee(); }
    public Untergrund createUntergrund() { return new Schnee(); }
}
