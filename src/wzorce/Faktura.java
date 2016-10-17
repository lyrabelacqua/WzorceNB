
package wzorce;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Faktura extends WzorZaplaty{
 
    static int numer = 0;
    
    public void drukujTytul() {
        System.out.println("--FAKTURA--");
    };
    
    @Override
    public void drukujDateSprzedazy() {
        GregorianCalendar dzis = new GregorianCalendar();
        int dzien = dzis.get(Calendar.DAY_OF_MONTH);
        int miesiac = dzis.get(Calendar.MONTH);
        int rok = dzis.get(Calendar.YEAR);
        System.out.println("Data Sprzedazy: " +dzien+"-"+miesiac+"-"+rok);
    
        int godzina = dzis.get(Calendar.HOUR_OF_DAY);
        int minuta = dzis.get(Calendar.MINUTE);
        int sekunda = dzis.get(Calendar.SECOND);
        System.out.println("Godzina Sprzedazy: " +godzina+":"+minuta+":"+sekunda);
    }
    
    @Override
    public void drukujNumer() {
        numer++;
        System.out.println("Faktura numer: "+ numer);
    }
    
    @Override
    public void drukujDaneNabywcy(Zamowienie z) {
        System.out.println("--NABYWCA--");
        System.out.println(z.getNabywca().getImieNabywcy() + " " + z.getNabywca().getNazwiskoNabywyc());
        System.out.println(z.getNabywca().getAdresNabywcy());
        System.out.println(z.getNabywca().getNIPNabywcy());
    }
    
    @Override
    public void drukujPodpis() {
        System.out.println("--PODPIS NABYWCY--");
        System.out.println("");
        System.out.println("--PODPIS SPRZEDAWCY--");
        System.out.println("");
    }
    
  
}
