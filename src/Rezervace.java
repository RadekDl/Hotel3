import java.time.LocalDate;
import java.util.List;

public class Rezervace {
    private Pokoj pokoj;// změna na bez listu na Pokoj pokoj
    private int pocetHostu;
    private LocalDate zacatekPobytu;
    private LocalDate konecPobytu;
    private boolean isPracovniPobyt;
    private List<OstatniHosti> ostatniHosti;
    private String hlavniHost;

    public Rezervace(Pokoj pokoj, int pocetHostu, LocalDate zacatekPobytu, LocalDate konecPobytu, boolean isPracovniPobyt, String hlavniHost){
        this.pokoj  = pokoj;
        this.pocetHostu = pocetHostu;
        this.zacatekPobytu = zacatekPobytu;
        this.konecPobytu = konecPobytu;
        this.isPracovniPobyt = isPracovniPobyt;
        this.ostatniHosti = ostatniHosti;
        this.hlavniHost = hlavniHost;
    }
    public Rezervace(Pokoj pokoj,int pocetHostu,LocalDate zacatekPobytu,LocalDate konecPobytu, String hlavniHost) {
        this(pokoj,pocetHostu,zacatekPobytu,konecPobytu,false,hlavniHost);

    }

    public Pokoj getPokoj() {
        return pokoj;
    }

    public void setPokoj(Pokoj pokoj) {
        this.pokoj = pokoj;
    }

    public int getPocetHostu() {
        return pocetHostu;
    }

    public void setPocetHostu(int pocetHostu) {
        this.pocetHostu = pocetHostu;
    }

    public LocalDate getZacatekPobytu() {
        return zacatekPobytu;
    }

    public void setZacatekPobytu(LocalDate zacatekPobytu) {
        this.zacatekPobytu = zacatekPobytu;
    }

    public LocalDate getKonecPobytu() {
        return konecPobytu;
    }

    public void setKonecPobytu(LocalDate konecPobytu) {
        this.konecPobytu = konecPobytu;
    }

    public boolean isPracovniPobyt() {
        return isPracovniPobyt;
    }

    public void setPracovniPobyt(boolean pracovniPobyt) {
        isPracovniPobyt = pracovniPobyt;
    }

    public List<OstatniHosti> getOstatniHosti() {
        return ostatniHosti;
    }

    public void setOstatniHosti(List<OstatniHosti> ostatniHosti) {
        this.ostatniHosti = ostatniHosti;
    }

    public String getHlavniHost() {
        return hlavniHost;
    }

    public void setHlavniHost(String hlavniHost) {
        this.hlavniHost = hlavniHost;
    }
}
