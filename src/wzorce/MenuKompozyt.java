
package wzorce;

import java.util.ArrayList;

public class MenuKompozyt extends MenuKomponent {
    
     private ArrayList<MenuKomponent> menu;
     private String opis;
     
     public MenuKompozyt(String o) {
         menu = new ArrayList<MenuKomponent>();
         opis = o;
     }

     public void dodajKomponent(MenuKomponent m) {
         menu.add(m);
     }
    
     public void usunKomponent(MenuKomponent m) {
         menu.remove(m);
     }
     
     public void pobierzKomponent(int i) {
         menu.get(i);
     }
     
     public void wyswietlKomponent() {
         System.out.println();
         System.out.println("--------------------");
         System.out.println(opis);
         for (MenuKomponent m: menu) {
             m.wyswietlKomponent();
         }
         System.out.println("--------------------");
         
     }
     
}
