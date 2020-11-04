package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] artikli = null;
    private static int broj=0;

    public Supermarket() {
        artikli = new Artikl[1000];
    }

    public boolean dodajArtikl(Artikl a) {
        broj++;
        if(broj>1000) return false;
        artikli[broj-1] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp=null;
        for(int i=0; i<broj; i++) {
            if(artikli[i].getKod().equals(kod)) {
                temp=artikli[i];
                for(int j=i; j<broj-1; j++)
                    artikli[j] = artikli[j+1];

                broj--;
                artikli[broj]=null;
                return temp;

            }
        }
        return temp;
    }
    public int brojArtikala () {
        return broj;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}
