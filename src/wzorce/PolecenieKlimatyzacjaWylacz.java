
package wzorce;


public class PolecenieKlimatyzacjaWylacz implements Polecenie {
    
    private Klimatyzacja klimatyzacja;
    
    public PolecenieKlimatyzacjaWylacz(Klimatyzacja k) {
        klimatyzacja = k;
    }
    
    public void wykonaj() {
        klimatyzacja.wylaczKlimatyzacje();
    }
    
    public void anuluj() {
        klimatyzacja.wlaczKlimatyzacje();
    }
}
