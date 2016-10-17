
package wzorce;

import java.math.BigDecimal;


public class PodatkiStare implements PodatkiStareInterfejs{
    
    @Override
    public BigDecimal liczPodatek(BigDecimal potrawa) {
        BigDecimal podatek = new BigDecimal("0.08");
        podatek = potrawa.multiply(podatek);
        potrawa = potrawa.add(podatek);
        return potrawa;
    
    }
    
    
    public BigDecimal liczPodatekDlaKawy(BigDecimal kawa) {
        BigDecimal podatek = new BigDecimal("0.10");
        podatek = kawa.multiply(podatek);
        kawa = kawa.add(podatek);
        return kawa;
    
    }
    
}
