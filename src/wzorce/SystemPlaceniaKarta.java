
package wzorce;

import java.util.GregorianCalendar;

public class SystemPlaceniaKarta {
  private  String nazwa;
  private String wersja;
  private Karta k;
  private Paragon p;

  
  SystemPlaceniaKarta(String na, String we) {
        this.nazwa = na;
        this.wersja = we;
   }
  
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getWersja() {
        return wersja;
    }

    public void setWersja(String wersja) {
        this.wersja = wersja;
    }
  
    public boolean weryfikacja(Karta ka) {
        GregorianCalendar obecnaData = new GregorianCalendar();
        String pattern="\\d\\d\\d-\\d\\d\\d";
        if((ka.getNumer().matches(pattern))&&(ka.getDatawaznosci().after(obecnaData))) {
            System.out.println("Karta poprawna! Przechodze do platnosci!");
                this.setK(ka);
            return true;
            }
        else {
            System.out.println("Nie udalo sie zweryfikowac karty.");
            return false;
        }
    }
    
   public void polaczcSie() {
        System.out.println("Polaczylem sie z bankiem! Rozpoczynam transakcje.");
    }
    
    public void rozlaczSie() {
        System.out.println("Rozlaczylem sie z bankiem! ! Transakcja zakonczona.");
        System.out.println("--- " + nazwa + ": " + wersja + " ---");
    
    }

    public Karta getK() {
        return k;
    }

    public void setK(Karta k) {
        this.k = k;
    }

    public Paragon getP() {
        return p;
    }

    public void setP(Paragon p) {
        this.p = p;
    }
    
}
