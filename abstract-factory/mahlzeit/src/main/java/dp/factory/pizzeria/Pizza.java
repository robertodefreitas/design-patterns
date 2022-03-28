package dp.factory.pizzeria;

import dp.factory.interfaces.Hauptgericht;

public class Pizza implements Hauptgericht {
    // ein konkretes Hauptgericht
    String className = getClass().getCanonicalName();

    @Override
    public void warmLiefern(){
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("[" + className + "] [" + methodeName + "] Pizza kann bald serviert werden!");
    };
}
