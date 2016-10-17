
package wzorce;

public class PolecenieResetujTerminal implements Polecenie  {
    
    private PrzenosnyTerminal terminal;
    
    public PolecenieResetujTerminal(PrzenosnyTerminal t) {
        terminal = t;
    }
    
    public void wykonaj() {
        terminal.reset();
    }
    
    public void anuluj() {
        System.out.println("Reset juz sie wykonal, nie moge go anulowac...");
    }
}
