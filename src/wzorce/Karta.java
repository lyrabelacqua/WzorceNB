
package wzorce;


import java.util.GregorianCalendar;

public class Karta {
    
    private String numer;
    private GregorianCalendar datawaznosci;
    private Zamowienie z;
    
   public Karta(String n, GregorianCalendar d) {
        this.numer = n;
        this.datawaznosci = d;
    }
  
 
   
   public void drukujPotwierdzenie() {
       System.out.println("-----PLATNOSC KARTA" + getNumer() + "----");
       System.out.println("Pobrano kwote" + getZ().wypiszSume()+ ".");
   }
   
   public void pobierzZobowiazanie() {
       System.out.println("Obciazam konto na sume " + getZ().wypiszSume());
   }
   
   public void dodajZobowiazanie(Zamowienie za) {
       this.z=za;
   }

    public GregorianCalendar getDatawaznosci() {
        return datawaznosci;
    }

    public void setDatawaznosci(GregorianCalendar datawaznosci) {
        this.datawaznosci = datawaznosci;
    }

    public Zamowienie getZ() {
        return z;
    }

    public void setZ(Zamowienie z) {
        this.z = z;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }
    
}
