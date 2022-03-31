package dp.observer.restaurant;

import dp.observer.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class RestaurantFabrik implements MahlzeitFabrik {
    // eine konkrete Familie/Fabrik

    private final List<HauptgerichtObserver> hauptgerichtObserverList = new ArrayList<>();
    private final List<Hauptgericht> hauptgerichtList = new ArrayList<>();

    @Override
    public Getraenk createGetraenk() {
        return new Saft();
    }

    @Override
    public Vorspeise createVorspeise() {
        return new Suppe();
    }

    @Override
    public Hauptgericht createHauptgericht(Integer id) {
        return new Kartoffelgratin(id);
    }

    /**
     * Hier wird das Gericht zu dem Beobachter gesendet, gepusht!
     */
    @Override
    public void addHauptgericht(Hauptgericht hauptgericht) {
        hauptgerichtList.add(hauptgericht);
        hauptgerichtObserverList.forEach((hauptgerichtObserverTmp) -> {
            hauptgerichtObserverTmp.hauptgerichtIstFertig(hauptgericht);
        });
    }

    @Override
    public void addHauptgerichtObserver(HauptgerichtObserver hauptgerichtObserver) {
        hauptgerichtObserverList.add(hauptgerichtObserver);
    }

    @Override
    public void removeHauptgerichtObserver(HauptgerichtObserver hauptgerichtObserver) {
        hauptgerichtObserverList.remove(hauptgerichtObserver);
    }
}
