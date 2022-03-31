package dp.observer.pizzeria;

import dp.observer.interfaces.Getraenk;

public class Wasser implements Getraenk {
    // ein konkretes Getränk
    private String className = getClass().getCanonicalName();

    @Override
    public void kuehlen(){
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName + " ist gekuehlt!");
    }
}
