import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BookingManager manager = new BookingManager();
        testovani(manager);
        zadaniRezervace(manager);

       /* Rezervace rezervace1 = new Rezervace(new Pokoj(1,2,true,true,BigDecimal.valueOf(1000)),1,
                LocalDate.of(2024,11,1),LocalDate.of(2024,11,19),
                true, new OstatniHosti("Karel","Nový");


        */
        }



        private static void zadaniRezervace (BookingManager manager) {
            OstatniHosti ostatniHosti1 = new OstatniHosti("Karel", " Dvořák ", LocalDate.of(1990, 5, 15));
            OstatniHosti ostatniHosti2 = new OstatniHosti("Karel ", "Dvořák ", LocalDate.of(1979, 3, 1));
            OstatniHosti ostatniHosti3 = new OstatniHosti("Tmavá ", "Karolína ");

            Pokoj pokoj1 = new Pokoj(1, 1, true, true, BigDecimal.valueOf(1000));
            Pokoj pokoj2 = new Pokoj(2, 1, true, true, BigDecimal.valueOf(1000));
            Pokoj pokoj3 = new Pokoj(3, 3, false, true, BigDecimal.valueOf(2400));

            Rezervace Rezervace;
            manager.addRezervace(new Rezervace(pokoj3, 1, LocalDate.of(2023, 6, 1),
                    LocalDate.of(2023, 6, 7), true, List.of(ostatniHosti1.getPrijmeni())));
            manager.addRezervace(new Rezervace(pokoj2, 1, LocalDate.of(2023, 7, 2),
                    LocalDate.of(2023, 7, 18), false, List.of(ostatniHosti2.getPrijmeni())));
            manager.addRezervace(new Rezervace(pokoj3, 2, LocalDate.of(2023, 8, 1),
                    LocalDate.of(2023, 8, 31), true, List.of(ostatniHosti1.getPrijmeni())));




            for (int i = 1; i < 20; i = i + 2) {
                manager.addRezervace(new Rezervace(pokoj2, LocalDate.of(2023, 8, i), LocalDate.of(2023, 8, i + 1),
                        List.of(ostatniHosti1.getPrijmeni())));
            }

        }
        private static void testovani (BookingManager manager){
            System.out.println("Počet pracovních pobytů je " + manager.getPocetRezervaciSPracPobytem());
            System.out.println("Počet všech hostů je " + manager.getPocetVsechHostu());
        }

    }


