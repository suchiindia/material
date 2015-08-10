/**
 * Created by Suchitra on 10-08-2015.
 */
public abstract class Quantity {

    public double toCentimeter(){return 0;}

    public static boolean isQuantityEqual(Quantity q1,Quantity q2){return q1.toCentimeter()==q2.toCentimeter();  }


}
