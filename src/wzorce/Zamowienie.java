
package wzorce;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Zamowienie {
    private ArrayList<Potrawa> potrawy = new ArrayList();
    private BigDecimal cena;
    private BigDecimal podatek;
    private Nabywca nabywca;
    private Stolik stolik;
   
    
    public ArrayList<Potrawa> getPotrawy() {
        return potrawy;
    }
    
    public BigDecimal policzSume(){
        cena = new BigDecimal("0");
        for (Potrawa a: potrawy) {
           cena = cena.add(a.wyliczCeneOstateczna());
        } 
        return cena;
    }
    
    public String wypiszSume() {
        return policzSume().toString();
    }
    
    public BigDecimal policzPodatek() {
        BigDecimal procent = new BigDecimal("0.08");
        podatek = policzSume().multiply(procent);
        return podatek;
    }

    public String wypiszPodatek() {
        policzPodatek();
        return podatek.toString();
    }

    public Nabywca getNabywca() {
        return nabywca;
    }

    public void setNabywca(Nabywca nabywca) {
        this.nabywca = nabywca;
    }

    public Stolik getStolik() {
        return stolik;
    }

    public void setStolik(Stolik stolik) {
        this.stolik = stolik;
    }
}
