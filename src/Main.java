import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Hosté
        Host host1 = new Host("Karel","Dvořák",LocalDate.of(1990,5,15));
        Host host2 = new Host("Karel","Dvořák",LocalDate.of(1979,1,3));
        Host host3 = new Host("Tmavá","Karolína");

        List<Host> ostatniHoste = new ArrayList<>();
        ostatniHoste.add(host1);
        ostatniHoste.add(host2);
        ostatniHoste.add(host3);

        //Pokoje
        Pokoj pokoj1 = new Pokoj(1,1,true,true,new BigDecimal("1000"));
        Pokoj pokoj2 = new Pokoj(2,1,true,true,new BigDecimal("1000"));
        Pokoj pokoj3 = new Pokoj(3,3,false,true,new BigDecimal("2400"));

        //Rezervace
        Rezervace rezervace1 = new Rezervace(pokoj3,1,LocalDate.of(2023,6,1),
                LocalDate.of(2023,6,7),true,host1);
        Rezervace rezervace2 = new Rezervace(pokoj2,1,LocalDate.of(2023,7,18),
                LocalDate.of(2023,7,21),false,host2);
        Rezervace rezervace3 = new Rezervace(pokoj3,2,LocalDate.of(2023,8,1),
                LocalDate.of(2023,8,31),true,host3,List.of(host1));

        List<Rezervace> listRezervaci =new ArrayList<>();
        listRezervaci.add(rezervace1);
        listRezervaci.add(rezervace2);
        listRezervaci.add(rezervace3);


        // for pro nové rezervace

        for(int i =0; i<20; i = i+2){
            listRezervaci.add(new Rezervace(pokoj2,1,LocalDate.of(2023,8,1+i),
                LocalDate.of(2023,8,2+i),true,host3));


    }
        System.out.println("\nvýpis po for\n");
        System.out.println(listRezervaci.get(0).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(0).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(0).getZacatekPobytu()+" "+listRezervaci.get(0).getKonecPobytu());
        System.out.println(listRezervaci.get(1).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(1).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(1).getZacatekPobytu()+" "+listRezervaci.get(1).getKonecPobytu());
        System.out.println(listRezervaci.get(2).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(2).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(2).getZacatekPobytu()+" "+listRezervaci.get(2).getKonecPobytu());
        System.out.println("\n"+listRezervaci.get(3).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(3).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(3).getZacatekPobytu()+" "+listRezervaci.get(3).getKonecPobytu());
        System.out.println(listRezervaci.get(4).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(4).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(4).getZacatekPobytu()+" "+listRezervaci.get(4).getKonecPobytu());
        System.out.println(listRezervaci.get(5).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(5).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(5).getZacatekPobytu()+" "+listRezervaci.get(5).getKonecPobytu());
        System.out.println(listRezervaci.get(6).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(6).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(6).getZacatekPobytu()+" "+listRezervaci.get(6).getKonecPobytu());
        System.out.println(listRezervaci.get(7).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(7).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(7).getZacatekPobytu()+" "+listRezervaci.get(7).getKonecPobytu());
        System.out.println(listRezervaci.get(8).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(8).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(8).getZacatekPobytu()+" "+listRezervaci.get(8).getKonecPobytu());
        System.out.println(listRezervaci.get(9).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(9).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(9).getZacatekPobytu()+" "+listRezervaci.get(9).getKonecPobytu());
        System.out.println(listRezervaci.get(10).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(10).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(10).getZacatekPobytu()+" "+listRezervaci.get(10).getKonecPobytu());
        System.out.println(listRezervaci.get(11).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(11).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(11).getZacatekPobytu()+" "+listRezervaci.get(11).getKonecPobytu());
        System.out.println(listRezervaci.get(12).getHlavniHost().getPrijmeni()+" "+listRezervaci.get(12).getHlavniHost().getDatumNarozeni()+" "+listRezervaci.get(12).getZacatekPobytu()+" "+listRezervaci.get(12).getKonecPobytu());


    }



}




