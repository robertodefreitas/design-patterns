package dp.observer.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface MahlzeitFabrik {
    // die abstrakte Familie/Fabrik "MahlzeitFabrik"

    Getraenk createGetraenk();
    Vorspeise createVorspeise();
    Hauptgericht createHauptgericht(Integer id);

    /**
     * Observer/Beobachter Methoden: PUSH
     */
    void beobachterBenachrichtigen(Hauptgericht hauptgericht);
    void addHauptgerichtObserver(HauptgerichtObserver hauptgerichtObserver);
    void removeHauptgerichtObserver(HauptgerichtObserver hauptgerichtObserver);

}
