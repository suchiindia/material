/**
 * Created by Suchitra on 10-08-2015.
 */
public class Yard extends Quantity {
    private double quantity;
   /* final private static double conversionFactorForYard=1;
    final private static double conversionFactorForInch=36;
    final private static double conversionFactorForFeet=3;*/
    final private static double conversionFactorForCentimeter=91.44;

    public double getQuantity() { return quantity; }


    public Yard(double quantity) { this.quantity = quantity; }
    public Yard(){}
  /*  public double toYard()  { return quantity*conversionFactorForYard;  }
    public double toInch()  { return quantity*conversionFactorForInch;  }
    public double toFeet()  { return quantity*conversionFactorForFeet;  }*/
    public double toCentimeter()  { return quantity*conversionFactorForCentimeter;  }
    public Quantity toMe(double quantity){ return new Yard(quantity/conversionFactorForCentimeter);}
    public Quantity addQuantity(Quantity quantity2){return toMe(this.toCentimeter() + quantity2.toCentimeter());}
    @Override
    public String toString() {
        return "In Yard{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Yard)) return false;

        Yard yard = (Yard) o;

        return Double.compare(yard.quantity, quantity) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(quantity);
        return (int) (temp ^ (temp >>> 32));
    }
}
