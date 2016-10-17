
package wzorce;

import java.math.BigDecimal;

public class PodatkowyAdapter implements PodatkiStareInterfejs{
    
    PodatkiNowe podatkinowe;
    
    public PodatkowyAdapter(PodatkiNowe nowe) {
        podatkinowe = nowe;
    }
    
    @Override
    public BigDecimal liczPodatek(BigDecimal potrawa) {
        return podatkinowe.podatek(potrawa);
    }
    
    
    @Override
    public BigDecimal liczPodatekDlaKawy(BigDecimal kawa) {
        return podatkinowe.podatekKawa(kawa);
   }
    
    
}
