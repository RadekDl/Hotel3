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


    }
    public List<Rezervace> zadavaniRezervaci(){
        for ()
    }
}




