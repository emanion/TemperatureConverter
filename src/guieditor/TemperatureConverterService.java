

package guieditor;

import java.text.NumberFormat;

/**
 *
 * @author emanion
 */
public class TemperatureConverterService {
    
    
    
    
    
    public double getCelciusFromFahrenheit(double fahrenheit){
        
        return(((fahrenheit - 32)*5)/9);
        
    }
    
    public String getCelciusFromFahrenheit(String fahrenheit)
        {
            //double f =  Double.valueOf(fahrenheit);
            
            double fahrenheitDouble = Double.parseDouble(fahrenheit);
            
            double celcius = ((fahrenheitDouble - 32)*5)/9;
            
            return Double.toString(celcius);
            
        
    }
    
    public double getFahrenheitFromCelcius(double celcius){
        
        return((celcius * 9) / 5) + 32;
        
    }
    
    public String getFahrenheitFromCelcius(String celcius)
        {
            //double f =  Double.valueOf(fahrenheit);
            
            double celciusDouble = Double.parseDouble(celcius);
            
            double fahrenheit = ((celciusDouble * 9) / 5) + 32;
            
            return Double.toString(fahrenheit);
            
        
    }
    
}
