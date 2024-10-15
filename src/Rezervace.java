import java.time.LocalDate;
import java.util.List;

public class Rezervace {
    private List<Pokoj> pokoj;// změna na bez listu
    private int pocetHostu;
    private LocalDate zacatekPobytu;
    private LocalDate konecPobytu;
    private boolean isPracovniPobyt;
    private List<Host> host;
    private String hlavniHost;

    public Rezervace(List<Pokoj> pokoj, int pocetHostu, LocalDate zacatekPobytu, LocalDate konecPobytu, boolean isPracovniPobyt, String hlavniHost){
        this.pokoj  = pokoj;
        this.pocetHostu = pocetHostu;
        this.zacatekPobytu = zacatekPobytu;
        this.konecPobytu = konecPobytu;
        this.isPracovniPobyt = isPracovniPobyt;
        this.host = host;
    }

    public String getHlavniHost() {
        return hlavniHost;
    }

    public void setHlavniHost(String hlavniHost) {
        this.hlavniHost = hlavniHost;
    }

    public List<Pokoj> getPokoj(){
        return pokoj;
    }
    public void setPokoj(List<Pokoj> pokoj){
        this.pokoj = pokoj;
    }
    public int getPocetHostu(){
        return pocetHostu;
    }
    public void setPocetHostu(int pocetHostu){
        this.pocetHostu = pocetHostu;
    }
    public LocalDate getZacatekPobytu(){
        return zacatekPobytu;
    }
    public void setZacatekPobytu(LocalDate zacatekPobytu){
        this.zacatekPobytu = zacatekPobytu;
    }
    public LocalDate getKonecPobytu(){
        return konecPobytu;
    }
    public void setKonecPobytu(LocalDate konecPobytu){
        this.konecPobytu = konecPobytu;
    }
    public boolean isPracovniPobyt() {
        return isPracovniPobyt;
    }
    public void setIsPracovniPobyt(boolean PracovniPobyt){
        isPracovniPobyt = PracovniPobyt;
    }

    public List<Host> getHost() {
        return host;
    }

    public void setHost(List<Host> host) {
        this.host = host;
    }
}
