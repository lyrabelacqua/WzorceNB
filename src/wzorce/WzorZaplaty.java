
package wzorce;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class WzorZaplaty {
    
  
    
    final void drukujRachunek(Sklep s, Zamowienie z) {
        drukujTytul();
        drukujDateWystawienia();
        drukujDateSprzedazy();
        drukujNumer();
        drukujDaneSprzedawcy(s);
        drukujDaneNabywcy(z);
        drukujZamowienie(z);
        drukujPodpis();
      }
    
    abstract public void drukujTytul();
    
    public final void drukujDateWystawienia() {
        GregorianCalendar dzis = new GregorianCalendar();
        int dzien = dzis.get(Calendar.DAY_OF_MONTH);
        int miesiac = dzis.get(Calendar.MONTH);
        int rok = dzis.get(Calendar.YEAR);
        System.out.println("Data Wystawienia: " +dzien+"-"+miesiac+"-"+rok);

        int godzina = dzis.get(Calendar.HOUR_OF_DAY);
        int minuta = dzis.get(Calendar.MINUTE);
        int sekunda = dzis.get(Calendar.SECOND);
        System.out.println("Godzina Wystawienia: " +godzina+":"+minuta+":"+sekunda);
    }
    
   public abstract void drukujDateSprzedazy();
    
   public abstract void drukujNumer();
    
   public final void drukujDaneSprzedawcy(Sklep skl) {
        System.out.println("--Sprzedawca--");
        System.out.println(skl.getImieWlasciciela() + " " + skl.getNazwiskoWlasciciela());
        System.out.println(skl.getAdresWlasciciela());
        System.out.println(skl.getNIPWlasciciela());
    
    }
    
   public abstract void drukujDaneNabywcy(Zamowienie z);
    
    public final void drukujZamowienie(Zamowienie z) {
         System.out.println("--Produkty--");
          int i = 1;
          for (Potrawa a: z.getPotrawy()) {
            System.out.println(i + ". " + a.getNazwa() + " " + a.wyliczCeneOstateczna().toString());
            i++;
          }
        System.out.println("Razem do zaplaty: " + z.wypiszSume());
        System.out.println("W tym podatku: " + z.wypiszPodatek());
    
    }
    
   public abstract void drukujPodpis();
    
 }
