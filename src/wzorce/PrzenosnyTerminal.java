
package wzorce;

import java.util.ArrayList;


public class PrzenosnyTerminal implements Obserwator{
    
    private int numer;
    private Polecenie[] przyciski;
    private Polecenie przyciskAnuluj;
    
    public PrzenosnyTerminal(int n) {
        numer = n;
        przyciski = new Polecenie[10];
        for (int i = 0; i < 10; i++) {
            przyciski[i] = new PoleceniePuste();
        }
        przyciskAnuluj = new PoleceniePuste();
    }
    
    public void rezerwacjaStolika(Stolik s, boolean stan, String kelner, RejestrStolikow r) {
        r.dodajRezerwacje(s, stan, kelner);
    }
    
    
    public void aktualizuj(ArrayList<Stolik> stanStolikow) {
        System.out.println("Tu terminal numer " + numer + ". Przesylam zmiane stanu stolikow");
        for (int i = 0; i < stanStolikow.size(); i++) {
            Stolik s = stanStolikow.get(i);
            String stan;
            if (s.isWolny())
                stan = "wolny";
            else 
                stan = "zajety";
            System.out.println("Stolik nr " + s.getNumer() + ", stan: " + stan + ", przydzielony kelner: " + s.getKelnerObslugujacy());
            if (!s.isWolny() && (s.getKelnerObslugujacy().equals("Brak"))) 
                System.out.println("UWAGA! Stolik numer " + s.getNumer() + " potrzebuje kogos do obslugi!");
        }
    }
    
    public void ustawPrzycisk(int i, Polecenie p) {
        przyciski[i] = p;
    }
    
    public void wcisnietoPrzycisk(int i) {
        przyciski[i].wykonaj();
        przyciskAnuluj = przyciski[i];
    }
    
    public void wcisnietoPrzyciskAnuluj() {
        przyciskAnuluj.anuluj();
    
    }
    
    public void reset() {
        System.out.println("Tu terminal nr " + numer + ". Zaraz nastapi reset urzadzenia.");
        System.out.println("Tu terminal nr " + numer + ". Zresetowalem sie i jestem gotowy do pracy");
    }
}
