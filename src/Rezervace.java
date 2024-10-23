import java.time.LocalDate;
import java.util.List;

public class Rezervace {
    private Pokoj pokoj;// změna na bez listu na Pokoj pokoj
    private int pocetHostu;
    private LocalDate zacatekPobytu;
    private LocalDate konecPobytu;
    private boolean isPracovniPobyt;
    private List<Host> dalsiHosti;
    private Host hlavniHost;

    public Rezervace(Pokoj pokoj, int pocetHostu, LocalDate zacatekPobytu, LocalDate konecPobytu,
                     boolean isPracovniPobyt, Host hlavniHost,List<Host> dalsiHosti){
        this.pokoj  = pokoj;
        this.pocetHostu = pocetHostu;
        this.zacatekPobytu = zacatekPobytu;
        this.konecPobytu = konecPobytu;
        this.isPracovniPobyt = isPracovniPobyt;
        this.dalsiHosti = dalsiHosti;
        this.hlavniHost = hlavniHost;
    }
    public Rezervace(Pokoj pokoj,int pocetHostu,LocalDate zacatekPobytu,LocalDate konecPobytu,
                     boolean isPracovnipobyt, Host hlavniHost) {
        this(pokoj,pocetHostu,zacatekPobytu,konecPobytu,isPracovnipobyt,hlavniHost,List.of());

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

    public List<Host> getDalsiHosti() {
        return dalsiHosti;
    }

    public void setDalsiHosti(List<Host> dalsiHosti) {
        this.dalsiHosti = dalsiHosti;
    }

    public Host getHlavniHost() {
        return hlavniHost;
    }

    public void setHlavniHost(Host hlavniHost) {
        this.hlavniHost = hlavniHost;
    }
}
