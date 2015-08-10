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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Centimeter)) return false;

        Centimeter that = (Centimeter) o;

        return Double.compare(that.quantity, quantity) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(quantity);
        return (int) (temp ^ (temp >>> 32));
    }
}
