package dp.observer.pizzeria;

import dp.observer.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class PizzeriaFabrik implements MahlzeitFabrik {
    // eine konkrete Familie/Fabrik

    private final List<HauptgerichtObserver> hauptgerichtObserverList = new ArrayList<>();
    private final List<Hauptgericht> hauptgerichtList = new ArrayList<>();

    @Override
    public Getraenk createGetraenk() {
        return new Wasser();
    }

    @Override
    public Vorspeise createVorspeise() {
        return new Salat();
    }

    @Override
    public Hauptgericht createHauptgericht(Integer id) {
        return new Pizza(id);
    }


    /**
     * Hier wird das Gericht zu dem Beobachter gesendet, gepusht!
     */
    @Override
    public void beobachterBenachrichtigen(Hauptgericht hauptgericht) {
        hauptgerichtList.add(hauptgericht);
        hauptgerichtObserverList.forEach((hauptgerichtObserverTmp) -> {
            hauptgerichtObserverTmp.benachrichtigungBearbeiten(hauptgericht);
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
