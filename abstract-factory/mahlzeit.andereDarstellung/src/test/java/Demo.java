
import dp.factory.interfaces.Getraenk;
import dp.factory.interfaces.Hauptgericht;
import dp.factory.interfaces.MahlzeitFabrik;
import dp.factory.interfaces.Vorspeise;

public class Demo {

    public static void main(String[] args) throws Exception {
        /**
         * CLIENT
         */
        System.out.println("=== [CLIENT] Pizzeria ===");
        MahlzeitFabrik fabrik = MahlzeitTest.createPizzeria();
        statusGetraenk(fabrik);
        statusVorspeise(fabrik);
        statusHauptgericht(fabrik);
        System.out.println("");

        System.out.println("=== [CLIENT] Restaurant ===");
        fabrik = MahlzeitTest.createRestaurant();
        statusGetraenk(fabrik);
        statusVorspeise(fabrik);
        statusHauptgericht(fabrik);
        System.out.println("");
    }


    /* DEMO Methoden */

    private static void statusGetraenk(MahlzeitFabrik fabrik) throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();

        Getraenk getraenk = fabrik.createGetraenk();
        System.out.println("=== [" + methodeName + "] ===");
        getraenk.kuehlen();
    }

    private static void statusVorspeise(MahlzeitFabrik fabrik) throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();

        Vorspeise vorspeise = fabrik.createVorspeise();
        System.out.println("=== [" + methodeName + "] ===");
        vorspeise.schnellVorbereiten();
    }

    private static void statusHauptgericht(MahlzeitFabrik fabrik) throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();

        Hauptgericht hauptgericht = fabrik.createHauptgericht();
        System.out.println("=== [" + methodeName + "] ===");
        hauptgericht.warmLiefern();
    }
}
