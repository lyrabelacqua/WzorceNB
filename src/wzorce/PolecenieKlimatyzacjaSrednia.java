
package wzorce;


public class PolecenieKlimatyzacjaSrednia implements Polecenie{
    
    private Klimatyzacja klimatyzacja;
    
    public PolecenieKlimatyzacjaSrednia(Klimatyzacja k) {
        klimatyzacja = k;
    }
    
    public void wykonaj() {
        klimatyzacja.ustawPoziomSredni();
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
