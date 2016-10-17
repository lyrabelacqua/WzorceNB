
package wzorce;

import java.math.BigDecimal;

public abstract class DodatekDekorator extends Pizza{
    private Pizza pizza;
    private BigDecimal CenaDodatku;
    private String opisDodatku;
    private String nazwaDodatku;
   
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public BigDecimal getCenaDodatku() {
        return CenaDodatku;
    }

    public void setCenaDodatku(BigDecimal CenaDodatku) {
        this.CenaDodatku = CenaDodatku;
    }
    
    public String getOpisDodatku() {
        return opisDodatku;
    }

    public void setOpisDodatku(String opisDodatku) {
        this.opisDodatku = opisDodatku;
    }
    
    public String getNazwaDodatku() {
        return nazwaDodatku;
    }


    public void setNazwaDodatku(String nazwaDodatku) {
        this.nazwaDodatku = nazwaDodatku;
    }
    
    @Override
    public abstract BigDecimal getCena();
    
    @Override
    public abstract String getOpis();
   
    @Override
    public abstract String getNazwa();

 
}
