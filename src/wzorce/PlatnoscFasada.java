
package wzorce;

public class PlatnoscFasada {
    Karta karta;
    SystemPlaceniaKarta system;
    Zamowienie zam;
    
    public PlatnoscFasada(Karta k, SystemPlaceniaKarta s, Zamowienie z) {
        this.karta = k;
        this.system = s;
        this.zam = z;
    }
    

    public void zaplac() {
       if(system.weryfikacja(karta)) {
            system.polaczcSie();
            system.getK().dodajZobowiazanie(zam);
            system.getK().pobierzZobowiazanie();
            system.rozlaczSie();
        }
    }

}
