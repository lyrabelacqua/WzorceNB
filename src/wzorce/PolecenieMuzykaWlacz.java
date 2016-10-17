
package wzorce;

public class PolecenieMuzykaWlacz implements Polecenie{
    
    private SystemMuzyki muzyka;
    
    public PolecenieMuzykaWlacz(SystemMuzyki m) {
        muzyka = m;
    }
    
    public void wykonaj() {
        muzyka.wlaczGlosniki();
        muzyka.wlaczRadio();
    }
    
    public void anuluj() {
        muzyka.wylaczRadio();
        muzyka.wylaczGlosniki();
    }
}
