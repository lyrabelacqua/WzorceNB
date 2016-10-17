
package wzorce;

public class PolecenieKlimatyzacjaWlacz implements Polecenie{
    
    private Klimatyzacja klimatyzacja;
    
    public PolecenieKlimatyzacjaWlacz(Klimatyzacja k) {
        klimatyzacja = k;
    }
    
    public void wykonaj() {
        klimatyzacja.wlaczKlimatyzacje();
    }
    
    public void anuluj() {
        klimatyzacja.wylaczKlimatyzacje();
    }
    
}
