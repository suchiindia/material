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

    @Override
    public String toString() {
        return "to Inch{" +
                "quantity=" + quantity +
                '}';
    }
}
