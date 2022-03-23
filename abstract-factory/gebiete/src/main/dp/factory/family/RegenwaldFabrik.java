package dp.factory.family;

import dp.factory.interfaces.AbstrakteGebietfabrik;
import dp.factory.interfaces.Pflanze;
import dp.factory.interfaces.Tier;
import dp.factory.interfaces.Untergrund;
import dp.factory.product.Baum;
import dp.factory.product.Girafe;
import dp.factory.product.Gras;

public class RegenwaldFabrik implements AbstrakteGebietfabrik {

    @Override
    public Pflanze createPflanze() {
        return new Baum();
    }

    @Override
    public Tier createTier() {
        return new Girafe();
    }

    @Override
    public Untergrund createUntergrund() {
        return new Gras();
    }
}
