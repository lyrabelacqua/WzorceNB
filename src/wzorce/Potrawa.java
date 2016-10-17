
package wzorce;

import java.math.BigDecimal;


public class Potrawa extends MenuKomponent {
    private BigDecimal cena;
    private String nazwa;
    private String opis;
    private Znizka strategia; 

    
    public Potrawa(String c, String n, String o) {
        cena = new BigDecimal(c);
        this.nazwa = n;
        this.opis = o;
        this.strategia=new NullZnizka();
    }
    
    public Potrawa() {
    }
    
    
    public BigDecimal getCena() {
        return cena;
    }

 
    public String getNazwa() {
        return nazwa;
    }


    public String getOpis() {
        return opis;
    }

   
    public Znizka getStrategia() {
        return strategia;
    }

    public void setStrategia(Znizka strategia) {
        this.strategia = strategia;
    }
    
   public BigDecimal wyliczCeneOstateczna() {
       return strategia.wyliczZnizke(cena);
      
   }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

  
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
   
    public void wyswietlKomponent() {
        System.out.println(nazwa.toUpperCase());
        System.out.println(opis);
        System.out.println("Cena: " + wyliczCeneOstateczna().toString()+ " PLN");
    }
    
 }
