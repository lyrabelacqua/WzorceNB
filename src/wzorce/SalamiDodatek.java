
package wzorce;

import java.math.BigDecimal;

public class SalamiDodatek extends DodatekDekorator {
    
    public SalamiDodatek(Pizza p) {
        setPizza(p);
        setNazwaDodatku("Salami");
        setCenaDodatku(new BigDecimal("2.0"));
        setOpisDodatku("Salami do Pizzy");
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
