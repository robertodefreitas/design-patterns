package dp.observer.restaurant;

import dp.observer.interfaces.Hauptgericht;
import dp.observer.interfaces.HauptgerichtObserver;

public class Kellner implements HauptgerichtObserver {
    private String name;

    public Kellner(String name) {
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
    public void benachrichtigungBearbeiten(Hauptgericht hauptgericht) {
        String simpleName = getClass().getSimpleName();
        String meldung = simpleName + " " + name + " wurde informiert wegen " + hauptgericht.getClass().getSimpleName() + " ID: " + hauptgericht.getId();
        System.out.println(meldung);
    }
}
