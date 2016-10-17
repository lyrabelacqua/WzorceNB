
package wzorce;


public class Stolik {
    
    private int numer;
    private boolean wolny;
    private String kelnerObslugujacy;
    
    public Stolik(int n, boolean w, String k) {
        numer = n;
        wolny = w;
        kelnerObslugujacy = k;
        
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public boolean isWolny() {
        return wolny;
    }

    public void setWolny(boolean wolny) {
        this.wolny = wolny;
    }

 
    public String getKelnerObslugujacy() {
        return kelnerObslugujacy;
    }

    public void setKelnerObslugujacy(String kelnerObslugujacy) {
        this.kelnerObslugujacy = kelnerObslugujacy;
    }
    
}
