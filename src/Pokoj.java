import java.math.BigDecimal;

public class Pokoj {
    private int cisloPokoje;
    private  int pocetLuzek;
    private boolean isBalkon;
    private boolean isVyhled;
    private BigDecimal cenaNoc;

    public Pokoj(int cisloPokoje, int pocetLuzek, boolean isBalkon, boolean isVyhled,BigDecimal cenaNoc){
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.isBalkon = isBalkon;
        this.isVyhled = isVyhled;
        this.cenaNoc = cenaNoc;
    }
   // public Pokoj(int cisloPokoje,BigDecimal cenaNoc){
   //     this(cisloPokoje,pocetLuzek,isBalkon,isVyhled,cenaNoc);
   // }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public boolean isBalkon() {
        return isBalkon;
    }

    public void setBalkon(boolean balkon) {
        isBalkon = balkon;
    }

    public boolean isVyhled() {
        return isVyhled;
    }

    public void setVyhled(boolean vyhled) {
        isVyhled = vyhled;
    }

    public BigDecimal getCenaNoc() {
        return cenaNoc;
    }

    public void setCenaNoc(BigDecimal cenaNoc) {
        this.cenaNoc = cenaNoc;
    }
}



