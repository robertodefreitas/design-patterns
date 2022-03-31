
import dp.observer.interfaces.*;
import dp.observer.pizzeria.Schankkellner;
import dp.observer.restaurant.Bueffetier;
import dp.observer.restaurant.Kellner;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws Exception {
        /**
         * CLIENT
         */
        System.out.println("=== [CLIENT] Pizzeria ===");
        MahlzeitFabrik fabrikPizzeria = MahlzeitTest.createPizzeria();

//        statusGetraenk(fabrik);
//        statusVorspeise(fabrik);

        List<HauptgerichtObserver> mitarbeiterPizzeriaList = Arrays.asList(
                new Schankkellner("Klaus"),
                new Schankkellner("Ana")
        );
        statusHauptgericht(fabrikPizzeria, mitarbeiterPizzeriaList);

        System.out.println("");


        System.out.println("=== [CLIENT] Restaurant ===");
        MahlzeitFabrik fabrikRestaurant = MahlzeitTest.createRestaurant();

//        statusGetraenk(fabrik);
//        statusVorspeise(fabrik);

        List<HauptgerichtObserver> mitarbeiterRestaurantList = Arrays.asList(
                new Kellner("Marlene"),
                new Bueffetier("Jan")
        );
        statusHauptgericht(fabrikRestaurant, mitarbeiterRestaurantList);

        System.out.println("");
    }


    /* DEMO Methoden */

    private static void statusGetraenk(MahlzeitFabrik fabrik) throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("=== [" + methodeName + "] ===");

        Getraenk getraenk = fabrik.createGetraenk();
        getraenk.kuehlen();
    }

    private static void statusVorspeise(MahlzeitFabrik fabrik) throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("=== [" + methodeName + "] ===");

        Vorspeise vorspeise = fabrik.createVorspeise();
        vorspeise.schnellVorbereiten();
    }

    private static void statusHauptgericht(
            MahlzeitFabrik fabrik,
            List<HauptgerichtObserver> mitarbeitern
    ) throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("=== [" + methodeName + "] ===");

        fabrik.addHauptgerichtObserver(mitarbeitern.get(0));

        Hauptgericht gericht1 = fabrik.createHauptgericht(generateId());
        gericht1.warmLiefern();
        fabrik.addHauptgericht(gericht1);

        System.out.println("");

        fabrik.addHauptgerichtObserver(mitarbeitern.get(1));

        Hauptgericht gericht2 = fabrik.createHauptgericht(generateId());
        gericht2.warmLiefern();
        fabrik.addHauptgericht(gericht2);

        System.out.println("");

        fabrik.removeHauptgerichtObserver(mitarbeitern.get(0));

        Hauptgericht gericht3 = fabrik.createHauptgericht(generateId());
        gericht3.warmLiefern();
        fabrik.addHauptgericht(gericht3);

        System.out.println("");
    }

    private static Integer generateId() throws InterruptedException {
        //Integer id = (int) (Math.random() * 10000);

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("HmsS");
        String datetime = ft.format(dNow);
        Integer id = Integer.parseInt(datetime);
        Thread.sleep(10);

        return id;
    }
}
