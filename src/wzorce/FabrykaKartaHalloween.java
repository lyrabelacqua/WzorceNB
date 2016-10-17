
package wzorce;

public class FabrykaKartaHalloween implements FabrykaKartaDan{
   
    public Naglowek utworzNaglowek() {
        return new NaglowekHalloween();
    }
    public Wstep utworzWstep() {
        return new WstepHalloween();
    }
    public Ozdobnik utworzDekoracja() {
        return new OzdobnikHalloween();
    }
    public WstepDoMenu utworzPozycje() {
        return new WstepDoMenuHalloween();
    }
}
