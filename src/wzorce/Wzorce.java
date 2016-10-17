
package wzorce;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wzorce {


    public static void main(String[] args) {
  
       // --- DANE SKLEPU --- 
        
        Sklep s = new Sklep();
        s.setImieWlasciciela("Jan");
        s.setNazwiskoWlasciela("Kowalski");
        s.getAdresWlasciciela("ul. Czarnego Bzu 3/5 \n00-000 Poznan");
        s.setNIPWlasciciela("123-456-32-18");
        
        // --- PRZYKLADOWY GOŚĆ ---
        
        Nabywca gosc = new Nabywca();
        gosc.setImieNabywcy("Anna");
        gosc.setNazwiskoNabywcy("Nowak");
        gosc.setAdresNabywcy("ul.Kubusia Puchatka 7/13 \n99-999 Poznan");
        gosc.setNIPNabywcy("123-456-32-81");
        
        
         //STOLIKI
        
        Stolik s1 = new Stolik(1,true,"Brak");
        Stolik s2 = new Stolik(2,true,"Brak");
        Stolik s3 = new Stolik(3,true,"Brak");
        Stolik s4 = new Stolik(4,true,"Brak");
        Stolik s5 = new Stolik(5,true,"Brak");
        
        RejestrStolikow rejestr = new RejestrStolikow();
        rejestr.dodajStolik(s1);
        rejestr.dodajStolik(s2);
        rejestr.dodajStolik(s3);
        rejestr.dodajStolik(s4); 
        rejestr.dodajStolik(s5);
        
        
        //TERMINALE, URZADZENIA
        
        SystemMuzyki systemMuz = new SystemMuzyki();
        Klimatyzacja klimatyzacja = new Klimatyzacja();
        
        PrzenosnyTerminal terminal = new PrzenosnyTerminal(1);
        PrzenosnyTerminal terminal2 = new PrzenosnyTerminal(2);
        
        EkranKuchni ekran = new EkranKuchni();
        
        
        // -- TWORZENIE ZAMOWIENIA I POTRAW --
        
        Zamowienie z = new Zamowienie();
        
        Potrawa p = new Potrawa("20", "Kluski", "Przepyszne kluski");
        Potrawa n = new Potrawa("10", "Orange Mocha", "Swiateczny przysmak");
        z.getPotrawy().add(p);
        z.getPotrawy().add(n);
        z.setStolik(s1);
        z.setNabywca(gosc);
        
        
        
       
       
        // -- STRATEGIA --
        System.out.println("\n --- STRATEGIA --- \n");
        System.out.println("Cena przed zastosowaniem strategii: " + z.wypiszSume());   
        p.setStrategia(new CzestyGoscZnizka());
        n.setStrategia(new StudentZnizka());
        System.out.println("Cena po zastosowaniu strategii:" + z.wypiszSume());
        
       // -- FASADA -- 
        System.out.println("\n --- FASADA --- \n");
        
        //system płacenia kartą - inicjalizacja
    
        SystemPlaceniaKarta spk = new SystemPlaceniaKarta("SuperSystemKartowy", "3.02");
        //stworzenie nowej karty debetowej
        Karta k = new Karta("123-123", new GregorianCalendar(2020,10,10));
       
        /*
         * placenie karta bez fasady...
         * 
         * //system weryfikuje kartę...
         * if(spk.weryfikacja(k)) {
         
         * //... i jeśli jest poprawna ściąga z karty odpowiednią kwotę...
            spk.polaczcSie();
            spk.getK().dodajZobowiazanie(z);
            spk.getK().pobierzZobowiazanie();
            * //... drukuje zamówienie...
            spk.drukuj();
            * //... i się rozłącza
            spk.rozlaczSie();
        
        }
       */
        
        PlatnoscFasada f = new PlatnoscFasada(k,spk,z);
        f.zaplac();
        
        
        // --- METODA SZABLONOWA -- FAKTURA VS PARAGON
        
        System.out.println("\n --- METODA SZABLONOWA --- \n");
        
        Paragon prr = new Paragon();
        prr.drukujRachunek(s,z);

        Faktura faktura = new Faktura();
        faktura.drukujRachunek(s,z);
        
        //--- SINGLETON --- 
        
        System.out.println("\n --- SINGLETON --- \n");
        
        Drukarka d = Drukarka.getDrukarka();
        Drukarka e = Drukarka.getDrukarka();
        e.drukuj();
        d.drukuj();
       // 
        
        
        //--- DEKORATOR ---
         
        System.out.println("\n --- DEKORATOR --- \n");
        
        Pizza pi =  new PizzaNaCienkimCiescie();
       
        pi = new SerDodatek(pi);
        pi = new SerDodatek(pi);
        pi = new SalamiDodatek(pi);
        
        Pizza pi2 =  new PizzaNaKlasycznymCiescie();
        
        pi2 = new SerDodatek(pi2);
        pi2 = new SalamiDodatek(pi2);
       
       System.out.println(pi.getCena().toString()); 
       System.out.println(pi.getOpis()); 
       System.out.println(pi.getNazwa());
       
       System.out.println(pi2.getCena().toString()); 
       System.out.println(pi2.getOpis()); 
       System.out.println(pi2.getNazwa());
       
     
      
       //--- ADAPTER ---
       
       
       System.out.println("\n --- ADAPTER--- \n");
       
       System.out.println("---STARY PODATEK---");
       PodatkiStare sp = new PodatkiStare();
       System.out.println("Podatek ogolny " + sp.liczPodatek(p.getCena()));
       System.out.println("Podatek dla kawy " + sp.liczPodatekDlaKawy(n.getCena()));
       
       System.out.println("---NOWY PODATEK---");
       PodatkiNowe np = new PodatkiNowe();
       System.out.println("Podatek ogolny " + np.podatek(p.getCena()));
       System.out.println("Podatek dla kawy " + np.podatekKawa(n.getCena()));
       
       System.out.println("---PODATKOWY ADAPTER---");
       PodatkowyAdapter adapter = new PodatkowyAdapter(np);
       System.out.println("Podatek ogolny: " + adapter.liczPodatek(p.getCena()));
       System.out.println("Podatek dla kawy: " + adapter.liczPodatekDlaKawy(n.getCena()));
       
       // --- OBSERWATOR ---
       
       System.out.println("\n --- OBSERWATOR --- \n");
       
       rejestr.dodajObserwatora(ekran);
       rejestr.dodajObserwatora(terminal);
       
       
       rejestr.dodajObserwatora(terminal2);
       terminal.rezerwacjaStolika(s1, false, "Jan Kowalski", rejestr);
       
     
       System.out.println();
       System.out.println("--- AKTUALIZACJA + USUNIECIE Z LISTY OBSERWATOROW");
       System.out.println();
      
       
       rejestr.usunObserwatora(terminal);
       terminal.rezerwacjaStolika(s2, false, "Brak", rejestr);
       
       //--- POLECENIE ---
       
       System.out.println("\n --- POLECENIE --- \n");
       
       PolecenieMuzykaWlacz muzykaWlacz = new PolecenieMuzykaWlacz(systemMuz);
       PolecenieMuzykaWylacz muzykaWylacz = new PolecenieMuzykaWylacz(systemMuz);
       
       PolecenieKlimatyzacjaWlacz klimatWlacz = new PolecenieKlimatyzacjaWlacz(klimatyzacja);
       PolecenieKlimatyzacjaWylacz klimatWylacz = new PolecenieKlimatyzacjaWylacz(klimatyzacja);
       PolecenieKlimatyzacjaSlaba klimatSlaba = new PolecenieKlimatyzacjaSlaba(klimatyzacja);
       PolecenieKlimatyzacjaSrednia klimatSrednia = new PolecenieKlimatyzacjaSrednia(klimatyzacja);
       PolecenieKlimatyzacjaMocna klimatMocna = new PolecenieKlimatyzacjaMocna(klimatyzacja);
       
       PolecenieResetujTerminal termReset = new PolecenieResetujTerminal(terminal);
       
       
       terminal.ustawPrzycisk(0, muzykaWlacz);
       terminal.ustawPrzycisk(1, muzykaWylacz);
       terminal.ustawPrzycisk(2, klimatWlacz);
       terminal.ustawPrzycisk(3, klimatWylacz);
       terminal.ustawPrzycisk(4, klimatSlaba);
       terminal.ustawPrzycisk(5, klimatSrednia);
       terminal.ustawPrzycisk(6, klimatMocna);
       terminal.ustawPrzycisk(7, termReset);
       
       
       
       System.out.println();
       
       for (int i = 0; i < 10; i++) {
            
            System.out.println("Efekt po wcisniesciu przycisku numer " + i + ":");
            terminal.wcisnietoPrzycisk(i);
            System.out.println("Efekt po anulowaniu wcisniecia przycisku numer " + i +":");
            terminal.wcisnietoPrzyciskAnuluj();
            System.out.println("------");
            
       }
       
       
       Polecenie kolejkaStart[] = {muzykaWlacz,klimatWlacz,klimatSrednia};
       PolecenieMakro makroStart = new PolecenieMakro(kolejkaStart);
       terminal.ustawPrzycisk(8, makroStart);
       System.out.println("");
       System.out.println("Efekt po wcisnieciu przycisku 8 z przypisanym mu makrem: ");
       terminal.wcisnietoPrzycisk(8);
       System.out.println("");
       System.out.println("Efekt po anulowaniu:");
       terminal.wcisnietoPrzyciskAnuluj();
       
  
       //--- FABRYKA --- 
       
       System.out.println("\n --- FABRYKA --- \n");
       
       FabrykaKartaDan fabrykaHalloween = new FabrykaKartaHalloween();
       FabrykaKartaDan fabrykaGwiazdka = new FabrykaKartaGwiazdka();
       
       System.out.println("Karta stworzona za pomoca FabrykiHalloween: ");
       KartaDan kartaHalloween = new KartaDan(fabrykaHalloween);
       kartaHalloween.utworzKarte();
       kartaHalloween.wyswietlKarte();
       System.out.println("-------------------------------");
       System.out.println();
       System.out.println("Karta stworzona za pomoca FabrykiGwiazdka");
       KartaDan kartaGwiazdka = new KartaDan(fabrykaGwiazdka);
       kartaGwiazdka.utworzKarte();
       kartaGwiazdka.wyswietlKarte();
       
       //--- KOMPOZYT ---
       
       System.out.println("\n --- KOMPOZYT --- \n");
       
       
       //utworzenie menu sniadaniowego
       
       MenuKompozyt menuSniadanie = new MenuKompozyt("MENU SNIADANIOWE");
       
       Potrawa jajecznicza = new Potrawa("20", "Jajecznica z warzywami", "Jajecznica z trzech jajek podawana z bukietem swiezych warzyw");
       Potrawa owsianka = new Potrawa("10", "Owsianka z owocami", "Zdrowa owsianka podana z owocami sezonowymi");
       Potrawa jogurt = new Potrawa("15", "Jogurt z granola", "Naturalny jogurt podany z granola. Do wyboru: granola orzechowa lub owocowa");
       
       menuSniadanie.dodajKomponent(jajecznicza);
       menuSniadanie.dodajKomponent(owsianka);
       menuSniadanie.dodajKomponent(jogurt);
       
       //utworzenie menu napoji
       
       MenuKompozyt menuNapoje = new MenuKompozyt("NAPOJE");
       
       Potrawa cocaCola = new Potrawa("5", "Coca-Cola", "Klasyczna Coca-Cola, pojemnosc: 330 ml");
       Potrawa woda = new Potrawa("4", "Woda niegazowana", "Woda mineralna najwyzszej jakosci, pojemnosc: 500ml");
       
       menuNapoje.dodajKomponent(cocaCola);
       menuNapoje.dodajKomponent(woda);
       
       //utworzenie podmenu kawowego
       
       MenuKompozyt menuKawa = new MenuKompozyt("KAWA");
       Potrawa espresso = new Potrawa("6", "Espresso", "Mocne espresso");
       Potrawa latte = new Potrawa("10", "Kawa Latte", "Lekkie i slodkie latte z nuta syropu waniliowego");
       
       menuKawa.dodajKomponent(espresso);
       menuKawa.dodajKomponent(latte);
       
       //dodanie menu kaw do menu napoji
       menuNapoje.dodajKomponent(menuKawa);
               
       Potrawa zupaDnia = new Potrawa("7", "Zupa Pomidorowa", "Gesta zupa pomidorowa podana z chrupkim pieczywem");
       Potrawa potrawaDnia = new Potrawa("20", "Salatka z grillowanym lososiem", "Grillowany losos podany na trzech roznych salatach wraz z pomidorami i cebula");
       
       MenuKompozyt menu = new MenuKompozyt("MENU");
       menu.dodajKomponent(menuSniadanie);
       menu.dodajKomponent(menuNapoje);
       menu.dodajKomponent(zupaDnia);
       menu.dodajKomponent(potrawaDnia);
       menu.wyswietlKomponent();
      // menuSniadanie.wyswietlKomponent();
      // potrawaDnia.wyswietlKomponent();
       
       
       
       //menu po usunieciu kilku pozycji i dodaniu nowych
       
      
       System.out.println();
       System.out.println("MENU PO USUNIECIU KILKU POZCYJI I DODANIU NOWYCH");
       
       
       menu.usunKomponent(zupaDnia);
       menu.usunKomponent(menuNapoje);
       
       MenuKompozyt menuCzekolada = new MenuKompozyt("CZEKOLADA DO PICIA");
       Potrawa czekoladaKlasyczna = new Potrawa("15", "Klasyczna Czekolada", "Gesta czekolada mleczna podawana z piankami");
       Potrawa czekoladaPomarancz = new Potrawa("15", "Czekolada Pomaranczowa", "Gorzka czelokada o smaku pomaranczy");
       menuCzekolada.dodajKomponent(czekoladaKlasyczna);
       menuCzekolada.dodajKomponent(czekoladaPomarancz);
       menu.dodajKomponent(menuCzekolada);
       
       menu.wyswietlKomponent();
    }
}
