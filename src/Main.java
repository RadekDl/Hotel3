import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Hosté
        Host host1 = new Host("Karel","Dvořák",LocalDate.of(1990,5,15));
        Host host2 = new Host("Karel","Dvořák",LocalDate.of(1979,1,3));
        Host host3 = new Host("Karolína","Tmavá");

        List<Host> ostatniHoste = new ArrayList<>();

        ostatniHoste.add(host1);


        //Pokoje
        Pokoj pokoj1 = new Pokoj(1,1,true,true,new BigDecimal("1000"));
        Pokoj pokoj2 = new Pokoj(2,1,true,true,new BigDecimal("1000"));
        Pokoj pokoj3 = new Pokoj(3,3,false,true,new BigDecimal("2400"));

        BookingManager bookingManager = new BookingManager();
        bookingManager.addRezervace(new Rezervace(pokoj3,1,LocalDate.of(2023,6,1),
                LocalDate.of(2023,6,7),true,host1));
        bookingManager.addRezervace(new Rezervace(pokoj2,1,LocalDate.of(2023,7,18),
                LocalDate.of(2023,7,21),false,host2));
        bookingManager.addRezervace(new Rezervace(pokoj3,2,LocalDate.of(2023,8,1),
                LocalDate.of(2023,8,31),true,host3,List.of(host1)));




        // nových 10 rezervací pomocí cyklu

        for(int i =0; i<20; i = i+2) {

                bookingManager.addRezervace(new Rezervace(pokoj2, 1, LocalDate.of(2023, 8, 1 + i),
                        LocalDate.of(2023, 8, 2 + i), true, host3));

        }
        //výpis rezervací

        for(int i =0; i< bookingManager.getRezervaces().size(); i++){

            System.out.println(bookingManager.getRezervace(i).getHlavniHost().getPrijmeni()
                    +" "+bookingManager.getRezervace(i).getHlavniHost().getDatumNarozeni()
                    +" "+bookingManager.getRezervace(i).getZacatekPobytu()
                    +" "+bookingManager.getRezervace(i).getKonecPobytu()
                    +" je to pracovní pobyt? "+bookingManager.getRezervace(i).isPracovniPobyt());
        }



        bookingManager.IsPracovniPobyt();


        }





    }







