/**
 * Created by Suchitra on 10-08-2015.
 */
public class Inch extends Quantity {
    private double quantity;
  /*  final private static double conversionFactorForYard=0.027;
    final private static double conversionFactorForInch=1;
    final private static double conversionFactorForFeet=1/12;*/
    final private static double conversionFactorForCentimeter=2.54;
    public double getQuantity() { return quantity; }

    public Inch(){}
    public Inch(double quantity) { this.quantity = quantity; }

   /* public double toYard()  { return quantity*conversionFactorForYard;  }
    public double toInch()  { return quantity*conversionFactorForInch;  }
    public double toFeet()  { return quantity*conversionFactorForFeet;  }
*/
    public double toCentimeter()  { return quantity*conversionFactorForCentimeter;  }
    public Quantity toMe(double quantity){
                return  new Inch(quantity/conversionFactorForCentimeter);}
    public Quantity toAdd(double quantity1,double quantity2){return toMe(quantity1+quantity2);}
    @Override
    public String toString() {
        return "In Inch{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inch)) return false;

        Inch inch = (Inch) o;

        return Double.compare(inch.quantity, quantity) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(quantity);
        return (int) (temp ^ (temp >>> 32));
    }
}
