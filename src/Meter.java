/**
 * Created by Suchitra on 10-08-2015.
 */
public class Meter {
  private double quantity;
    final private static double conversionFactorForCentimeter=100;

    public double getQuantity() {
        return quantity;
    }

    public Meter(double quantity) {
        this.quantity = quantity;
    }

    public Centimeter toCentimeter()
    {
        return new Centimeter()
    }
}

