package family;

import interfaces.AbstrakteGebietfabrik;
import interfaces.Pflanze;
import interfaces.Tier;
import interfaces.Untergrund;
import product.Baum;
import product.Girafe;
import product.Gras;

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
