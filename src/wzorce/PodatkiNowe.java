
package wzorce;

import java.math.BigDecimal;

public class PodatkiNowe implements PodatkiNoweInterfejs{
   
    public BigDecimal podatek(BigDecimal potrawa) {
        BigDecimal podatek = new BigDecimal("0.10");
        podatek = potrawa.multiply(podatek);
        potrawa = potrawa.add(podatek);
        return potrawa;
    }
    
    public BigDecimal podatekKawa(BigDecimal kawa) {
        BigDecimal podatek = new BigDecimal("0.23");
        podatek = kawa.multiply(podatek);
        kawa = kawa.add(podatek);
        return kawa;
    }
    
}
