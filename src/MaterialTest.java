import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Suchitra on 10-08-2015.
 */
public class MaterialTest {

    @Test
    public void testIsMaterialEqual() throws Exception {
    Meter materialInMeter = new Meter(10);
        Centimeter materialInCentimeter = new Centimeter(1000);
        Assert.assertTrue(Material.isMaterialEqual(materialInMeter, materialInCentimeter));
    }
    @Test
    public void testIsMaterialNotEqual() throws Exception {
        Meter materialInMeter = new Meter(10);
        Centimeter materialInCentimeter = new Centimeter(1000);
        Assert.assertFalse(Material.isMaterialEqual(materialInMeter, materialInCentimeter));
    }
}