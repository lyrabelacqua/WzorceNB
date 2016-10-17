
package wzorce;

import java.util.ArrayList;

public class Drukarka {
    
    private static Drukarka d;
    private boolean wlaczona = false;
    public int lista = 0;
    
    private Drukarka() {};
    
    public static Drukarka getDrukarka() {
        if (d==null) {
            d = new Drukarka();
            System.out.println("Tworze nowa drukarke!");
        }
        else {
            System.out.println("Korzystam z istniejacej drukarki");
        }
       return d; 
    }
    
    public void drukuj() {
        lista++;
        if (!wlaczona){
            wlaczona = true;
            System.out.println("Wlaczam drukarke");
        }
        else 
           System.out.println("Jestem juz wlaczona");
    
        System.out.println("Numer dokumentu na liscie drukowania: " + lista);
    }
  
}
