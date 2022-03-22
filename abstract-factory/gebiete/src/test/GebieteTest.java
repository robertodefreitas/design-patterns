import family.PolargebietFabrik;
import interfaces.AbstrakteGebietfabrik;
import interfaces.Pflanze;
import interfaces.Tier;
import interfaces.Untergrund;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
