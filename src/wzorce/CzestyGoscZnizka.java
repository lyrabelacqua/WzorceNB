
package wzorce;

import java.math.BigDecimal;


public class CzestyGoscZnizka implements Znizka {
    
    public BigDecimal wyliczZnizke(BigDecimal c) {
        BigDecimal znizka = new BigDecimal("0.8");           
        return c.multiply(znizka);
    }
}
