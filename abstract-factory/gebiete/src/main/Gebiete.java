import family.PolargebietFabrik;
import interfaces.AbstrakteGebietfabrik;
import interfaces.Pflanze;

public class Gebiete {

    /**
     * Von einer PolargebietFabrik alle Schritte ausführen lassen
     */
    Gebiete() {
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
