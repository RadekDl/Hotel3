import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Host host1 = new Host("Adéla","Malíková", LocalDate.of(1993,3,13));
        Host host2 = new Host("Jan","Dvořáček",LocalDate.of(1995,5,5));
        List<Host> seznamHostu = new ArrayList<>();
        seznamHostu.add(host1);
        seznamHostu.add(host2);

        host2.setDatumNarozeni(LocalDate.of(1995,4,5));
        System.out.println(host2.getJmeno()+" "+host2.getPrijmeni()+" "+host2.getDatumNarozeni());

        Pokoj pokoj1 = new Pokoj(1,1,true,true, BigDecimal.valueOf(1000.0));
        Pokoj pokoj2 = new Pokoj(2,1,true,true, BigDecimal.valueOf(1000.0));
        Pokoj pokoj3 = new Pokoj(3,3,false,true,BigDecimal.valueOf(2400.0));

        List<Pokoj> seznamPokoju = new ArrayList<>();
        seznamPokoju.add(pokoj1);
        seznamPokoju.add(pokoj2);
        seznamPokoju.add(pokoj3);

        Rezervace rezervace1 = new Rezervace(seznamPokoju,1,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),true,host1.getPrijmeni());
        Rezervace rezervace2 = new Rezervace(seznamPokoju,3,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),false,host2.getPrijmeni());

        List<Rezervace> seznamRezervaci =  new ArrayList<>();
        seznamRezervaci.add(rezervace1);
        seznamRezervaci.add(rezervace2);

        for (Rezervace tiskRezervaci : seznamRezervaci){
            System.out.println("Rezervace pokoje číslo "+ tiskRezervaci.getPokoj().getFirst().getCisloPokoje()+ " počet hostů "+ tiskRezervaci.getPocetHostu()+seznamHostu.getFirst().getPrijmeni());

        }
    }
}