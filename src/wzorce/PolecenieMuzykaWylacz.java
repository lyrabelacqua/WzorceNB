
package wzorce;


public class PolecenieMuzykaWylacz implements Polecenie{
    private SystemMuzyki muzyka;
    
    public PolecenieMuzykaWylacz(SystemMuzyki m) {
        muzyka = m;
    }
    
    public void wykonaj() {
        muzyka.wylaczRadio();
        muzyka.wylaczGlosniki();
    }
    
    public void anuluj() {
        muzyka.wlaczGlosniki();
        muzyka.wlaczRadio();
    }
}
