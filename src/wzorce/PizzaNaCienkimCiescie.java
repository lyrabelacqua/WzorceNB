
package wzorce;

import java.math.BigDecimal;

public class PizzaNaCienkimCiescie extends Pizza {
    
     
    public PizzaNaCienkimCiescie() {
        setNazwa("Cienkie ciasto");
        setOpis("Pyszne cienkie ciasto");
        setCena(new BigDecimal("20"));
        setStrategia(new NullZnizka());
  }
 }
