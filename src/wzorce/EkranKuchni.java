
package wzorce;

import java.util.ArrayList;

public class EkranKuchni implements Obserwator {
    
    private ArrayList<Stolik> stanStolikow;
    
    public void aktualizuj(ArrayList<Stolik> st) {
        stanStolikow = st;
        System.out.println("Jestem ekranem w kuchnii i wyswietlam obecny plan stolikow");
        for (int i = 0; i < stanStolikow.size(); i++) {
            Stolik s = stanStolikow.get(i);
            String stan;
            if (s.isWolny())
                stan = "wolny";
            else 
                stan = "zajety";
            System.out.println("Stolik nr " + s.getNumer() + ", stan: " + stan + ", przydzielony kelner: " + s.getKelnerObslugujacy());
        }
    }
    
    
}
