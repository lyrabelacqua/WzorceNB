
package wzorce;

public class KartaDan {
    
    private Naglowek naglowek;
    private Wstep wstep;
    private Ozdobnik ozdobnik;
    private WstepDoMenu menu;
    private FabrykaKartaDan fabryka;
    
    public KartaDan(FabrykaKartaDan f) {
        fabryka = f;
    }
    
    public void utworzKarte() {
        naglowek = fabryka.utworzNaglowek();
        wstep = fabryka.utworzWstep();
        ozdobnik = fabryka.utworzDekoracja();
        menu = fabryka.utworzPozycje();
    }
    
    public void wyswietlKarte() {
        System.out.println(naglowek.getTresc());
        System.out.println(wstep.getTresc());
        System.out.println(ozdobnik.getOpis());
        System.out.println(menu.getOpis());
    }

    public void setFabryka(FabrykaKartaDan fabryka) {
        this.fabryka = fabryka;
    }
    
    
    
    
}
