
import dp.observer.interfaces.*;
import dp.observer.pizzeria.Pizza;
import dp.observer.pizzeria.PizzeriaFabrik;
import dp.observer.pizzeria.Salat;
import dp.observer.pizzeria.Wasser;
import dp.observer.restaurant.RestaurantFabrik;
import dp.observer.restaurant.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MahlzeitTest {

    /**
     * TESTS
     */

    @Test
    public void pizzeriaTest() throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        MahlzeitFabrik fabrik = createPizzeria();

        Getraenk getraenkExpected = new Wasser();
        Vorspeise vorspeiseExpected = new Salat();
        Hauptgericht hauptgerichtExpected = new Pizza(1);

        testTemplate(methodeName, fabrik, getraenkExpected, vorspeiseExpected, hauptgerichtExpected);
    }

    @Test
    public void restaurantTest() throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        MahlzeitFabrik fabrik = createRestaurant();

        Getraenk getraenkExpected = new Saft();
        Vorspeise vorspeiseExpected = new Suppe();
        Hauptgericht hauptgerichtExpected = new Kartoffelgratin(1);

        testTemplate(methodeName, fabrik, getraenkExpected, vorspeiseExpected, hauptgerichtExpected);
    }


    /**
     * METHODEN
     */

    static public MahlzeitFabrik createPizzeria() {
        MahlzeitFabrik fabrik = new PizzeriaFabrik();
        return fabrik;
    }

    static public MahlzeitFabrik createRestaurant() {
        MahlzeitFabrik fabrik = new RestaurantFabrik();
        return fabrik;
    }


    public void testTemplate(
            String methodeName,
            MahlzeitFabrik fabrik,
            Getraenk getraenkExpected,
            Vorspeise vorspeiseExpected,
            Hauptgericht hauptgerichtExpected
    ) throws Exception {
        //String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();

        Getraenk getraenkActual = fabrik.createGetraenk();
        Vorspeise vorspeiseActual = fabrik.createVorspeise();
        Hauptgericht hauptgerichtActual = fabrik.createHauptgericht(1);

        System.out.println("=== [" + methodeName + "] ===");
        getraenkActual.kuehlen();
        vorspeiseActual.schnellVorbereiten();
        hauptgerichtActual.warmLiefern();

        Assertions.assertFalse(getraenkExpected.equals(getraenkActual));
        Assertions.assertEquals(getraenkExpected.getClass(), getraenkActual.getClass());
        Assertions.assertEquals(vorspeiseExpected.getClass(), vorspeiseActual.getClass());
        Assertions.assertEquals(hauptgerichtExpected.getClass(), hauptgerichtActual.getClass());
        System.out.println("");
    }
}
