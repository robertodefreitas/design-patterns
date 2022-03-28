package dp.factory.interfaces;

public interface MahlzeitFabrik {
    // die abstrakte Familie/Fabrik "MahlzeitFabrik"
    Getraenk createGetraenk();
    Vorspeise createVorspeise();
    Hauptgericht createHauptgericht();
}
