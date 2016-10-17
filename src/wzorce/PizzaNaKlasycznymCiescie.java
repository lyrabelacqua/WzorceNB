
package wzorce;

import java.math.BigDecimal;

public class PizzaNaKlasycznymCiescie extends Pizza {
  
  public PizzaNaKlasycznymCiescie() {
    setNazwa("Cienkie ciasto");
    setOpis("Klasyczne wloskie ciasto");
    setCena(new BigDecimal("20"));
    setStrategia(new NullZnizka());
  }
}
