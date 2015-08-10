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
    public Quantity addQuantity(Quantity quantity2){return toMe(this.toCentimeter() + quantity2.toCentimeter());}
    @Override
    public String toString() {
        return "In Meter{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meter)) return false;

        Meter meter = (Meter) o;

        return Double.compare(meter.quantity, quantity) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(quantity);
        return (int) (temp ^ (temp >>> 32));
    }
}

