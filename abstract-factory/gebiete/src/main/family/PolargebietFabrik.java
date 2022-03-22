package family;

import interfaces.AbstrakteGebietfabrik;
import interfaces.Pflanze;
import interfaces.Tier;
import interfaces.Untergrund;
import product.Eisbaer;
import product.Flechte;
import product.Schnee;

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
