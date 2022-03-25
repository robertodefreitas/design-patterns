package dp.factory.product;

import dp.factory.interfaces.Getraenk;

public class Wasser implements Getraenk {
    // ein konkretes Getränk
    String className = getClass().getCanonicalName();

    @Override
    public void kuehlen(){
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("[" + className + "] [" + methodeName + "] Wasser ist gekuehlt!");
    }
}
