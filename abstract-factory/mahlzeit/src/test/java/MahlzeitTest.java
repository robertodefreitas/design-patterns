
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

    public MahlzeitFabrik createPizzeria() {
        MahlzeitFabrik fabrik = new PizzeriaFabrik();
        return fabrik;
    }

    public MahlzeitFabrik createRestaurant() {
        MahlzeitFabrik fabrik = new RestaurantFabrik();
        return fabrik;
    }


    /* TESTS */

    @Test
    public void pizariaTest() throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        MahlzeitFabrik fabrik = createPizzeria();

        Getraenk getraenkExpected = new Wasser();
        Vorspeise vorspeiseExpected = new Salat();
        Hauptgericht hauptgerichtExpected = new Pizza();

        Getraenk getraenkActual = fabrik.createGetraenk();
        Vorspeise vorspeiseActual = fabrik.createVorspeise();
        Hauptgericht hauptgerichtActual = fabrik.createHauptgericht();

        System.out.println("=== [" + methodeName + "] ===");
        getraenkActual.kuehlen();

        Assertions.assertFalse(getraenkExpected.equals(getraenkActual));
        Assertions.assertEquals(getraenkExpected.getClass(), getraenkActual.getClass());
        Assertions.assertEquals(vorspeiseExpected.getClass(), vorspeiseActual.getClass());
        Assertions.assertEquals(hauptgerichtExpected.getClass(), hauptgerichtActual.getClass());
        System.out.println("");
    }

    @Test
    public void restaurantTest() throws Exception {
        String methodeName = new Object(){}.getClass().getEnclosingMethod().getName();
        MahlzeitFabrik fabrik = createRestaurant();

        Getraenk getraenkExpected = new Saft();
        Vorspeise vorspeiseExpected = new Suppe();
        Hauptgericht hauptgerichtExpected = new Kartoffelgratin();

        Getraenk getraenkActual = fabrik.createGetraenk();
        Vorspeise vorspeiseActual = fabrik.createVorspeise();
        Hauptgericht hauptgerichtActual = fabrik.createHauptgericht();

        System.out.println("=== [" + methodeName + "] ===");
        getraenkActual.kuehlen();

        Assertions.assertFalse(getraenkExpected.equals(getraenkActual));
        Assertions.assertEquals(getraenkExpected.getClass(), getraenkActual.getClass());
        Assertions.assertEquals(vorspeiseExpected.getClass(), vorspeiseActual.getClass());
        Assertions.assertEquals(hauptgerichtExpected.getClass(), hauptgerichtActual.getClass());
        System.out.println("");
    }

}
