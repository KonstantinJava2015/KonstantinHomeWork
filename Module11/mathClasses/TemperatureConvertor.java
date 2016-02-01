package mathClasses;

/**
 * Created by User on 22.12.2015.
 */
public class TemperatureConvertor {
    public static double celsiusToFahrenheit (double value){
        return value * 1.8 + 32;
    }

    public static double fahrenheitToCelsius (double value){
        return (value - 32) / 1.8;
    }
}
