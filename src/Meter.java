/**
 * Created by Suchitra on 10-08-2015.
 */
public class Meter extends Quantity {
  private double quantity;
    final private static double conversionFactorForCentimeter=100;


    public double getQuantity() {
        return quantity;
    }
    public Meter(){}
    public Meter(double quantity) {
        this.quantity = quantity;
    }

    public double toCentimeter() { return quantity*conversionFactorForCentimeter;  }
    public Quantity toMe(double quantity){return new Meter(quantity/conversionFactorForCentimeter);}

    @Override
    public String toString() {
        return "In Meter{" +
                "quantity=" + quantity +
                '}';
    }
}

