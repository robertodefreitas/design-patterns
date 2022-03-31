package dp.observer.restaurant;

import dp.observer.interfaces.Getraenk;

public class Saft implements Getraenk {
    // ein konkretes Getränk
    private String className = getClass().getCanonicalName();

    @Override
    public void kuehlen(){
        String simpleName = getClass().getSimpleName();
        System.out.println(simpleName + " ist gekuehlt!");
    }
}
