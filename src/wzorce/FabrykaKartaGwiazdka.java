
package wzorce;

public class FabrykaKartaGwiazdka implements FabrykaKartaDan{
     
    public Naglowek utworzNaglowek() {
        return new NaglowekGwiazdka();
    }
    public Wstep utworzWstep() {
        return new WstepGwiazdka();
    }
    public Ozdobnik utworzDekoracja() {
        return new OzdobnikGwiazdka();
    }
    public WstepDoMenu utworzPozycje() {
        return new WstepDoMenuGwiazdka();
    }
}
