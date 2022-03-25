package dp.factory.product;

import dp.factory.interfaces.Vorspeise;

public class Suppe implements Vorspeise {
    // eine konkrete Vorspeise
    String className = getClass().getCanonicalName();

    @Override
    public void schnellVorbereiten() {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("[" + className + "] [" + methodeName + "] Suppe wird schnell vorbereitet!");
    };
}
