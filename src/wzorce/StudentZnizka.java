
package wzorce;

import java.math.BigDecimal;

public class StudentZnizka implements Znizka{
    
    public BigDecimal wyliczZnizke(BigDecimal c) {
        BigDecimal znizka = new BigDecimal("0.9");
        return c.multiply(znizka) ;  }
}
