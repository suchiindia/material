/**
 * Created by Suchitra on 10-08-2015.
 */
public abstract class Quantity {

    public double getQuantity() { return 0; }
    public double toCentimeter(){return 0;}
    public Quantity toMe(double quantity){return null;}
    public Quantity toAdd(double quantity1,double quantity2){return null;}
    public static boolean isQuantityEqual(Quantity q1,Quantity q2){return q1.toCentimeter()==q2.toCentimeter();}
    public static Quantity convertQuantity(Quantity q1,Quantity q2){return q2.toMe((q1.toCentimeter()));}
    public static Quantity addQuantity(Quantity q1,Quantity q2){return q2.toAdd(q1.toCentimeter(),q2.toCentimeter());}


}
