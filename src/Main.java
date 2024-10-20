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
        ostatniHoste.add(host2);
        ostatniHoste.add(host3);

        //Pokoje
        Pokoj pokoj1 = new Pokoj(1,1,true,true,new BigDecimal("1000"));
        Pokoj pokoj2 = new Pokoj(2,1,true,true,new BigDecimal("1000"));
        Pokoj pokoj3 = new Pokoj(3,3,false,true,new BigDecimal("2400"));

        BookingManager bookingManager = new BookingManager();
        List<Rezervace> rezervaces = new ArrayList<>();
        rezervaces.add(new Rezervace(pokoj3,1,LocalDate.of(2023,6,1),
                LocalDate.of(2023,6,7),true,host1));
        rezervaces.add(new Rezervace(pokoj2,1,LocalDate.of(2023,7,18),
                LocalDate.of(2023,7,21),false,host2));
        rezervaces.add(new Rezervace(pokoj3,2,LocalDate.of(2023,8,1),
               LocalDate.of(2023,8,31),true,host3,List.of(host1)));

        // nových 10 rezervací pomocí cyklu
        for(int i =0; i<20; i = i+2) {
            rezervaces.add(new Rezervace(pokoj2, 1, LocalDate.of(2023, 8, 1 + i),
                    LocalDate.of(2023, 8, 2 + i), true, host3));

        }
//        Výpis rezervací
        for(int i =0; i< rezervaces.size(); i++){

            System.out.println(rezervaces.get(i).getHlavniHost().getPrijmeni()
                    +" "+rezervaces.get(i).getHlavniHost().getDatumNarozeni()
                    +" "+rezervaces.get(i).getZacatekPobytu()
                    +" "+rezervaces.get(i).getKonecPobytu()
                    +" je to pracovní pobyt? "+rezervaces.get(i).isPracovniPobyt());
        }

        int pocet;
        pocet = bookingManager.getPocetPracRezervaci();
            System.out.println("\npracovních pobytů je " + pocet);







        //Rezervace bez BokingManagera
//        Rezervace rezervace1 = new Rezervace(pokoj3,1,LocalDate.of(2023,6,1),
//                LocalDate.of(2023,6,7),true,host1);
//        Rezervace rezervace2 = new Rezervace(pokoj2,1,LocalDate.of(2023,7,18),
//                LocalDate.of(2023,7,21),false,host2);
//        Rezervace rezervace3 = new Rezervace(pokoj3,2,LocalDate.of(2023,8,1),
//                LocalDate.of(2023,8,31),true,host3,List.of(host1));
//
//        List<Rezervace> listRezervaci =new ArrayList<>();
//        listRezervaci.add(rezervace1);
//        listRezervaci.add(rezervace2);
//        listRezervaci.add(rezervace3);


//         for pro nové rezervace
//
//        for(int i =0; i<20; i = i+2){
//            listRezervaci.add(new Rezervace(pokoj2,1,LocalDate.of(2023,8,1+i),
//                LocalDate.of(2023,8,2+i),true,host3));
//
//
//    }

//        for(int i =0; i< listRezervaci.size(); i++){
//
//            System.out.println(listRezervaci.get(i).getHlavniHost().getPrijmeni()
//                    +" "+listRezervaci.get(i).getHlavniHost().getDatumNarozeni()
//                    +" "+listRezervaci.get(i).getZacatekPobytu()
//                    +" "+listRezervaci.get(i).getKonecPobytu()
//                    +" je to pracovní pobyt? "+listRezervaci.get(i).isPracovniPobyt());
//        }

    }

}




