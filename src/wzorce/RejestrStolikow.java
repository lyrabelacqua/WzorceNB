
package wzorce;

import java.util.ArrayList;

public class RejestrStolikow implements Podmiot{
    
    private ArrayList listaObserwatorow = new ArrayList();
    private ArrayList<Stolik> listaStolikow = new ArrayList<Stolik>();
    
    public void dodajStolik(Stolik s) {
        listaStolikow.add(s);
    }
    
    public void dodajRezerwacje(Stolik s, boolean st, String k){
       int staryStolik = listaStolikow.indexOf(s);
        if(staryStolik >= 0 ) {
            Stolik nowy = new Stolik(s.getNumer(),st, k);
            listaStolikow.set(staryStolik, nowy);
            powiadomObserwatorow();
 
        }
    
    }
    
   public void dodajObserwatora(Obserwator o) {
        listaObserwatorow.add(o);
    }
    
    public void usunObserwatora(Obserwator o) {
        int i = listaObserwatorow.indexOf(o);
        if (i>=0)
            listaObserwatorow.remove(o);
    }
    
    public void powiadomObserwatorow() {
        for (int i = 0; i < listaObserwatorow.size(); i++) {
            Obserwator o = (Obserwator) listaObserwatorow.get(i);
            o.aktualizuj(listaStolikow);
        }
    }
}

