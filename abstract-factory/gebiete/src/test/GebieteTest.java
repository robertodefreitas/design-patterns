
import dp.factory.Gebiete;
import dp.factory.family.PolargebietFabrik;
import dp.factory.interfaces.AbstrakteGebietfabrik;
import dp.factory.interfaces.Pflanze;
import dp.factory.interfaces.Tier;
import dp.factory.interfaces.Untergrund;
import org.junit.jupiter.api.Test;

public class GebieteTest {
    Gebiete gebiet = new Gebiete();

    public AbstrakteGebietfabrik createPolar() {
        AbstrakteGebietfabrik fabrik = new PolargebietFabrik();
        return fabrik;
    }

    /* TESTS */

    @Test
    public void polarTest() throws Exception {
        AbstrakteGebietfabrik fabrik = createPolar();
        Pflanze pflanze = fabrik.createPflanze();
        Tier tier = fabrik.createTier();
        Untergrund untergrund = fabrik.createUntergrund();

        System.out.println("RESULT: " + pflanze.toString());
        //Assertions.assertEquals(1120, ga.summeAlleMuenzenCentsKasse());
    }

}
