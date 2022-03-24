package dp.factory.product;

import dp.factory.interfaces.Getraenk;

public class Saft implements Getraenk {
    // ein konkretes Getränk
    String className = Saft.class.getCanonicalName();

    @Override
    public void kuehlen(){
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("[" + className + "] [" + methodeName + "] Saft ist gekuehlt!");
    }
}
