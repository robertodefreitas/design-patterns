package dp.factory.product;

import dp.factory.interfaces.Hauptgericht;

public class Kartoffelgratin implements Hauptgericht {
    // ein konkretes Hauptgericht
    String className = getClass().getCanonicalName();

    @Override
    public void warmLiefern(){
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("[" + className + "] [" + methodeName + "] Kartoffelgratin kann bald serviert werden!");
    };
}
