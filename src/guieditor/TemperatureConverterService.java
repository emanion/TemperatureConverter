

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
            double f = Double.valueOf(fahrenheit);
            
            
            
        
    }
    
}
