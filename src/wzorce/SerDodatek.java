
package wzorce;

import java.math.BigDecimal;


public class SerDodatek extends DodatekDekorator {
    
    public SerDodatek(Pizza p) {
        setPizza(p);
        setNazwaDodatku("Ser");
        setCenaDodatku(new BigDecimal("0.5"));
        setOpisDodatku("Ser do Pizzy");
        setStrategia(new NullZnizka());
        setCena(getCena());
        setOpis(getOpis());
        setNazwa(getNazwa());
    }
    
    @Override
    public BigDecimal getCena() {
       return getPizza().getCena().add(getCenaDodatku());
    }
    
    @Override
    public String getOpis() {
        return getPizza().getOpis() + " + " + getOpisDodatku();
    }
    
    @Override
   public String getNazwa() {
        return getPizza().getNazwa() + " + " + getNazwaDodatku();
   }
    
}
