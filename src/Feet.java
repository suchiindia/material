/**
 * Created by Suchitra on 10-08-2015.
 */
public class Feet extends Quantity {
    private double quantity;
   /* final private static double conversionFactorForYard=0.33;
    final private static double conversionFactorForInch=12;
    final private static double conversionFactorForFeet=1;8*/
    final private static double conversionFactorForCentimeter=30.48;
    public double getQuantity() { return quantity; }

    public Feet(){}
    public Feet(double quantity) { this.quantity = quantity; }

   /* public double toYard()  { return quantity*conversionFactorForYard;  }
    public double toInch()  { return quantity*conversionFactorForInch;  }
    public double toFeet()  { return quantity*conversionFactorForFeet;  }*/
    public double toCentimeter()  { return quantity*conversionFactorForCentimeter;  }
    public Quantity toMe(double quantity){ return new Feet(quantity/conversionFactorForCentimeter);}
    public Quantity toAdd(double quantity1,double quantity2){return toMe(quantity1+quantity2);}
    @Override
    public String toString() {
        return "In Feet{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feet)) return false;

        Feet feet = (Feet) o;

        return Double.compare(feet.quantity, quantity) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(quantity);
        return (int) (temp ^ (temp >>> 32));
    }
}
