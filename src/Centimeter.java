/**
 * Created by Suchitra on 10-08-2015.
 */
public class Centimeter {
    private double quantity;
    final private static double conversionFactorForMeter=100;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public static double getConversionFactorForMeter() {
        return conversionFactorForMeter;
    }
}
