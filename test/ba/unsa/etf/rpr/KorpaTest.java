package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private static Artikl artikl;
    private static Korpa korpa;
    @BeforeAll
    static void setUp() {
        korpa = new Korpa();
        artikl = new Artikl("Artikl" , 500, "c18");
    }

    @Test
    void dodajArtikl() {
        assertTrue(korpa.dodajArtikl(artikl)); //dodaje artikl
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        korpa.dodajArtikl(artikl);
        korpa.dodajArtikl(artikl);
        assertEquals(1500, korpa.dajUkupnuCijenuArtikala());
    }
}