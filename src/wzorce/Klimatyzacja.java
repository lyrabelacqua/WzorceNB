
package wzorce;


public class Klimatyzacja {
    
    private int sila;
    private int ostatniaSila;
    private boolean wlaczony;
    
    public Klimatyzacja() {
        sila = 1;
        wlaczony = false;
        ostatniaSila = 1;
    }
    
    public void wlaczKlimatyzacje() {
        wlaczony = true;
        System.out.println("Klimatyzacja wlaczona na poziom " + sila);
    }
    
    public void wylaczKlimatyzacje() {
        wlaczony= false;
        System.out.println("Klimatyzacja wylaczona.");
    }
    
    public void ustawPoziomSlaby() {
        if (!wlaczony) {
            wlaczKlimatyzacje();
        }
        ostatniaSila = sila;
        sila = 1;
        System.out.println("Klimatyzacja ustawiona na poziom " + sila);
    }
    
    public void ustawPoziomSredni() {
        if (!wlaczony) {
            wlaczKlimatyzacje();
        }
        ostatniaSila = sila;
        sila = 5;
        System.out.println("Klimatyzacja ustawiona na poziom " + sila);
    }
    
    public void ustawPoziomMocny() {
        if (!wlaczony) {
            wlaczKlimatyzacje();
        }
        ostatniaSila = sila;
        sila = 10;
        System.out.println("Klimatyzacja ustawiona na poziom " + sila);
    }

    
    public int getOstatniaSila() {
        return ostatniaSila;
    }
    
    
}
