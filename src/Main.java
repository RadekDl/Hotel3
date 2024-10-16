import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BookingManager manager = new BookingManager();
        testovani(manager);


        Host host1 = new Host("Adéla","Malíková", LocalDate.of(1993,3,13));
        Host host2 = new Host("Jan","Dvořáček",LocalDate.of(1995,5,5));

        List<Host> seznamHostu = listHostu(host1, host2);

        System.out.println(host2.getJmeno()+" "+host2.getPrijmeni()+" "+host2.getDatumNarozeni());

        Pokoj pokoj1 = new Pokoj(1,1,true,true, BigDecimal.valueOf(1000.0));
        Pokoj pokoj2 = new Pokoj(2,1,true,true, BigDecimal.valueOf(1000.0));
        Pokoj pokoj3 = new Pokoj(3,3,false,true,BigDecimal.valueOf(2400.0));

        listPokuju(pokoj1, pokoj2, pokoj3);

        manager.addRezervace(new Rezervace(pokoj1,1,LocalDate.of(2024,12,1),LocalDate.of(2024,12,12),true,host1.getPrijmeni()));
        manager.addRezervace(new Rezervace(pokoj3,2,LocalDate.of(2024,10,15),LocalDate.of(2024,10,30),false,host2.getPrijmeni()));

        Rezervace rezervace1 = new Rezervace(pokoj1,1,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),true,host1.getPrijmeni());
        Rezervace rezervace2 = new Rezervace(pokoj3,2,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),false,host2.getPrijmeni());

        List<Rezervace> seznamRezervaci = listRezervaci(rezervace1, rezervace2);

        for (Rezervace tiskRezervaci : seznamRezervaci){
            int inedxPocetHostu;
            inedxPocetHostu = tiskRezervaci.getPocetHostu() - 1;
            System.out.println("Rezervace pokoje číslo "+ tiskRezervaci.getPokoj().getCisloPokoje()+ " počet hostů "+ tiskRezervaci.getPocetHostu()+" "+seznamHostu.getFirst().getPrijmeni()
            +" + "+ inedxPocetHostu+" další host/é.");

        }

        System.out.println();

    }

    private static void testovani(BookingManager manager){
        System.out.println("Počet prec pobytů "+manager.getPocetRezervaciSPracPobytem());
        System.out.println("\npočet všech hostů "+manager.getPocetVsechHostu());

    }


    private static List<Host> listHostu(Host host1, Host host2) {
        List<Host> seznamHostu = new ArrayList<>();
        seznamHostu.add(host1);
        seznamHostu.add(host2);
        host2.setDatumNarozeni(LocalDate.of(1995,4,5));
        return seznamHostu;
    }

    private static List<Rezervace> listRezervaci(Rezervace rezervace1, Rezervace rezervace2) {
        List<Rezervace> seznamRezervaci =  new ArrayList<>();
        seznamRezervaci.add(rezervace1);
        seznamRezervaci.add(rezervace2);
        return seznamRezervaci;
    }

    private static void listPokuju(Pokoj pokoj1, Pokoj pokoj2, Pokoj pokoj3) {
        List<Pokoj> seznamPokoju = new ArrayList<>();
        seznamPokoju.add(pokoj1);
        seznamPokoju.add(pokoj2);
        seznamPokoju.add(pokoj3);
    }
}