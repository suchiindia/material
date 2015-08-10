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

    @Override
    public String toString() {
        return "to Feet{" +
                "quantity=" + quantity +
                '}';
    }
}
