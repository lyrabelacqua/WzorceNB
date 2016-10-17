
package wzorce;

public class PolecenieMakro implements Polecenie {
    
    Polecenie kolejka[];
    
    public PolecenieMakro(Polecenie[] k) {
        kolejka = k;
    }
    
    public void wykonaj() {
        for (int i = 0; i < kolejka.length; i++) {
            kolejka[i].wykonaj();
        }
    }
    
    public void anuluj() {
        for (int i = kolejka.length-1; i >= 0; i--) {
            kolejka[i].anuluj();
        }
    }
}
