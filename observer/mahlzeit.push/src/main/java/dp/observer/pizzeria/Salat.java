package dp.observer.pizzeria;

import dp.observer.interfaces.Vorspeise;

public class Salat implements Vorspeise {
    // eine konkrete Vorspeise
    private String className = getClass().getCanonicalName();

    @Override
    public void schnellVorbereiten() {
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName + " wird schnell vorbereitet!");
    };
}
