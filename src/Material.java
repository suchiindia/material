/**
 * Created by Suchitra on 10-08-2015.
 */
public class Material {


    public static double meterToCentimeter(Meter materialInMeter)
    {
        return materialInMeter.getQuantity()*Meter.getConversionFactorForCentimeter();
    }
    public static double centimeterToMeter(Centimeter materialInCentimeter)
    {
        return materialInCentimeter.getQuantity()/Centimeter.getConversionFactorForMeter();
    }

    public static boolean isMaterialEqual(Meter materialInMeter,Centimeter materialInCentimeter){
        return meterToCentimeter(materialInMeter)==materialInCentimeter.getQuantity();
    }
}
