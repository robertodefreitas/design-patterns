package dp.factory;

import dp.factory.family.PolargebietFabrik;
import dp.factory.interfaces.AbstrakteGebietfabrik;

public class Gebiete {

    /**
     * Von einer PolargebietFabrik alle Schritte ausf�hren lassen
     */
    public Gebiete() {
        AbstrakteGebietfabrik fabrik = new PolargebietFabrik();
        var pflanze = fabrik.createPflanze();
        var tier = fabrik.createTier();
        var untergrund = fabrik.createUntergrund();
    }

    /**
     * Ein neues Gebiet beginnen
     *
     * @param args werden ignoriert
     */
    public static void main(String[] args) {
        Gebiete gebiet = new Gebiete();
    }
}
