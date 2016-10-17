
package wzorce;


public class PolecenieKlimatyzacjaMocna implements Polecenie{
    
    private Klimatyzacja klimatyzacja;
    
    public PolecenieKlimatyzacjaMocna(Klimatyzacja k) {
        klimatyzacja = k;
    }
    
    public void wykonaj() {
        klimatyzacja.ustawPoziomMocny();
    }
    
    public void anuluj() {
        if(klimatyzacja.getOstatniaSila()==10) {
            klimatyzacja.ustawPoziomMocny();
        }
        else if (klimatyzacja.getOstatniaSila()==5) {
             klimatyzacja.ustawPoziomSredni();
        }
        
        else if (klimatyzacja.getOstatniaSila()==1) {
             klimatyzacja.ustawPoziomSlaby();
        }
    }
    
}
