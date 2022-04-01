package dp.observer.restaurant;

import dp.observer.interfaces.Vorspeise;

public class Suppe implements Vorspeise {
    // eine konkrete Vorspeise
    private String className = getClass().getCanonicalName();

    @Override
    public void schnellVorbereiten() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName + " wird schnell vorbereitet!");
    };
}
