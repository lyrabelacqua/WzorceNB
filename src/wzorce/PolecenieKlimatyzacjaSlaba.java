
package wzorce;


public class PolecenieKlimatyzacjaSlaba implements Polecenie{
   
    private Klimatyzacja klimatyzacja;
    
    public PolecenieKlimatyzacjaSlaba(Klimatyzacja k) {
        klimatyzacja = k;
    }
    
    public void wykonaj() {
        klimatyzacja.ustawPoziomSlaby();
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
