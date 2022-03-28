
import dp.factory.family.PizzeriaFabrik;
import dp.factory.family.RestaurantFabrik;
import dp.factory.interfaces.MahlzeitFabrik;
import dp.factory.interfaces.Getraenk;
import dp.factory.interfaces.Vorspeise;
import dp.factory.interfaces.Hauptgericht;
import dp.factory.product.*;
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
        Hauptgericht hauptgerichtExpected = new Pizza();

        testTemplate(methodeName, fabrik, getraenkExpected, vorspeiseExpected, hauptgerichtExpected);
    }

    @Test
    public void restaurantTest() throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        MahlzeitFabrik fabrik = createRestaurant();

        Getraenk getraenkExpected = new Saft();
        //Vorspeise vorspeiseExpected = new Suppe();
        Vorspeise vorspeiseExpected = new Salat();
        Hauptgericht hauptgerichtExpected = new Kartoffelgratin();

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


    public void testTemplate(String methodeName, MahlzeitFabrik fabrik, Getraenk getraenkExpected, Vorspeise vorspeiseExpected, Hauptgericht hauptgerichtExpected) throws Exception {
        //String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();

        Getraenk getraenkActual = fabrik.createGetraenk();
        Vorspeise vorspeiseActual = fabrik.createVorspeise();
        Hauptgericht hauptgerichtActual = fabrik.createHauptgericht();

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
