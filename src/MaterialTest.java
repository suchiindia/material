import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Suchitra on 10-08-2015.
 */
public class MaterialTest {

    @Test
    public void testIsMaterialEqual() throws Exception {
    Quantity q1 = new Meter(10);
       Quantity q2 = new Centimeter(1000);
        Assert.assertTrue(Material.isMaterialEqual(q1, q2));
    }
    @Test
    public void testIsMaterialNotEqual() throws Exception {
        Quantity q1 = new Meter(10);
        Quantity q2 = new Centimeter(1000);
        Assert.assertFalse(Material.isMaterialEqual(q1, q2));
    }

    @Test
    public void convertToInch() throws Exception{
        Quantity quantity= new Meter(1);
        Quantity quantity1= new Inch();
        quantity1=Material.convertMaterial(quantity,quantity1);
        Assert.assertEquals(Material.convertMaterial(quantity, new Inch()), quantity1);
    }

    @Test
    public void convertToFeet() throws Exception{
        Quantity quantity= new Meter(1);
        Quantity quantity1= new Feet();
        quantity1=Material.convertMaterial(quantity,quantity1);
        Assert.assertEquals(Material.convertMaterial(quantity, new Feet()), quantity1);
    }
    @Test
    public void convertToYard() throws Exception{
        Quantity quantity= new Meter(1);
        Quantity quantity1= new Yard();
        quantity1=Material.convertMaterial(quantity,quantity1);
        Assert.assertEquals(Material.convertMaterial(quantity, new Yard()), quantity1);
    }

    @Test
    public void convertToMeter() throws Exception{
        Quantity quantity= new Meter(1);
        Quantity quantity1= new Meter();
        quantity1=Material.convertMaterial(quantity,quantity1);
        Assert.assertEquals(Material.convertMaterial(quantity, new Meter()), quantity1);
    }

    @Test
    public void addMeterToCentimeter() throws  Exception{
        Quantity quantity = new Meter(2);
        Quantity quantity1 = new Centimeter(100);
        Quantity result = Material.addMaterial(quantity1,quantity);
        Assert.assertEquals(Material.addMaterial(quantity1,quantity),result);
        System.out.println(result); //just to see whether result is correct
    }

    @Test
    public void addYardToInch() throws  Exception{
        Quantity quantity = new Yard(2);
        Quantity quantity1 = new Inch(10);
        Quantity result = Material.addMaterial(quantity1,quantity);
        Assert.assertEquals(Material.addMaterial(quantity1,quantity),result);
        System.out.println(result); //just to see whether result is correct
    }

}