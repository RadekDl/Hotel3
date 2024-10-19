import java.time.LocalDate;

public class Host {;
    private String prijmeni;
    private String jmeno;
    private LocalDate datumNarozeni;

    public Host(String jmeno,String prijmeni,LocalDate datumNarozeni){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }
    public Host(String jmeno,String prijmeni){
        this(jmeno,prijmeni,LocalDate.of(1000,1,1));
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }
}
