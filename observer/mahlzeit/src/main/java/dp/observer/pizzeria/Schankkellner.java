package dp.observer.pizzeria;

import dp.observer.interfaces.Hauptgericht;
import dp.observer.interfaces.HauptgerichtObserver;

public class Schankkellner implements HauptgerichtObserver {
    private String name;

    public Schankkellner(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void hauptgerichtIstFertig(Hauptgericht hauptgericht) {
        String simpleName = getClass().getSimpleName();
        String meldung = simpleName + " " + name + " wurde informiert wegen " + hauptgericht.getClass().getSimpleName() + " ID: " + hauptgericht.getId();
        System.out.println(meldung);
    }
}