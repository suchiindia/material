/**
 * Created by Suchitra on 10-08-2015.
 */
public class Centimeter extends Quantity {
    private double quantity;
    final private static double conversionFactorForCentimeter=1;


    public double getQuantity() { return quantity; }

    public Centimeter(){}
    public Centimeter(double quantity) { this.quantity = quantity; }

    public double toCentimeter()  { return quantity*conversionFactorForCentimeter;  }
    public Quantity toMe(double quantity){return new Centimeter(quantity/conversionFactorForCentimeter);}

    @Override
    public String toString() {
        return "In Centimeter{" +
                "quantity=" + quantity +
                '}';
    }
}
