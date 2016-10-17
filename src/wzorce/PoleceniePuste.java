
package wzorce;

public class PoleceniePuste implements Polecenie{
    public void wykonaj() {
        System.out.println("Ten przycisk nie obsluguje zadnej opcji. Prosze wybrac inny przycisk.");
    }
    
    public void anuluj() {
        System.out.println("Ostatnio wcisnales nieobslugiwany przycisk. Nie ma operacji, ktora moge anulowac.");
    }
    
}
