
package wzorce;

public class Paragon extends WzorZaplaty {
    
    static int numer = 0;
    
    @Override
    public void drukujTytul() {
        System.out.println("--PARAGON--");
    }
    
    @Override
    public void drukujDateSprzedazy() {
        // pusta metoda - na paragonie nie drukujemy daty sprzedaży
    }
    
    @Override
    public void drukujNumer() {
        numer++;
        System.out.println("Pargon fiskalny numer: " + numer);
    }
    
    @Override
    public void drukujDaneNabywcy(Zamowienie z) {
        // pusta metoda - dane niedrukowane na paragonie
    }
    
    @Override
    public void drukujPodpis() {
      System.out.println("Kasjer");
      System.out.println("Kasa Fiskalna #1");
    }
    
   
}
