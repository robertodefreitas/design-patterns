
import dp.factory.family.PolargebietFabrik;
import dp.factory.family.RegenwaldFabrik;
import dp.factory.interfaces.AbstrakteGebietfabrik;
import dp.factory.interfaces.Pflanze;
import dp.factory.interfaces.Tier;
import dp.factory.interfaces.Untergrund;
import dp.factory.product.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GebieteTest {

    public AbstrakteGebietfabrik createPolar() {
        AbstrakteGebietfabrik fabrik = new PolargebietFabrik();
        return fabrik;
    }

    public AbstrakteGebietfabrik createRegenwald() {
        AbstrakteGebietfabrik fabrik = new RegenwaldFabrik();
        return fabrik;
    }


    /* TESTS */

    @Test
    public void polarTest() throws Exception {
        AbstrakteGebietfabrik fabrik = createPolar();

        Pflanze pflanzeActual = fabrik.createPflanze();
        Tier tierActual = fabrik.createTier();
        Untergrund untergrundActual = fabrik.createUntergrund();

        Pflanze pflanzeExpected = new Flechte();
        Tier tierExpected = new Eisbaer();
        Untergrund untergrundExpected = new Schnee();

        //System.out.println("RESULT: " + pflanzeActual.getClass());

        Assertions.assertFalse(pflanzeExpected.equals(pflanzeActual));

        Assertions.assertEquals(pflanzeExpected.getClass(), pflanzeActual.getClass());
        Assertions.assertEquals(tierExpected.getClass(), tierActual.getClass());
        Assertions.assertEquals(untergrundExpected.getClass(), untergrundActual.getClass());
    }

    @Test
    public void regenwaldTest() throws Exception {
        AbstrakteGebietfabrik fabrik = createRegenwald();

        Pflanze pflanzeActual = fabrik.createPflanze();
        Tier tierActual = fabrik.createTier();
        Untergrund untergrundActual = fabrik.createUntergrund();

        Pflanze pflanzeExpected = new Baum();
        Tier tierExpected = new Girafe();
        Untergrund untergrundExpected = new Gras();

        //System.out.println("RESULT: " + pflanzeActual.getClass());

        Assertions.assertFalse(pflanzeExpected.equals(pflanzeActual));

        Assertions.assertEquals(pflanzeExpected.getClass(), pflanzeActual.getClass());
        Assertions.assertEquals(tierExpected.getClass(), tierActual.getClass());
        Assertions.assertEquals(untergrundExpected.getClass(), untergrundActual.getClass());
    }

}
