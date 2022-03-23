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
    public Pflanze createPflanze() {
        return new Flechte();
    }

    @Override
    public Tier createTier() {
        return new Eisbaer();
    }

    @Override
    public Untergrund createUntergrund() {
        return new Schnee();
    }
}
