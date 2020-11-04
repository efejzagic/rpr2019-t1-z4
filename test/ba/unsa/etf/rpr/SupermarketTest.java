package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private static Supermarket s;
    private static Artikl a;

    @BeforeAll
    static void setUp() {
       a = new Artikl("Biciklo" , 890, "c1");
       s = new Supermarket();
       s.dodajArtikl(new Artikl("Biciklo" , 890, "c2"));
    }

    @Test
    void dodajArtikl() {
        for(int i=0; i<5; i++)
            s.dodajArtikl(new Artikl("Biciklo" , 890, String.valueOf(i+1)));
        assertEquals(6, s.brojArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        s.dodajArtikl(a);
        s.izbaciArtiklSaKodom("3");
        assertEquals(6, s.brojArtikala());

    }
}