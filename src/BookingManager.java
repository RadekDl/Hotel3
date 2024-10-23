import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Rezervace> rezervaces = new ArrayList<>();


    public void addRezervace(Rezervace rezervace) {     //přidání nové rezervace do seznamu
        rezervaces.add(rezervace);
    }

    public Rezervace getRezervace(int index) {//získání rezervace dle indexu

        return rezervaces.get(index);
    }

    public List<Rezervace> getRezervaces() {             //seznam rezervací
        return new ArrayList<>(rezervaces);
    }

    public void clearRezervaces() {                      //smazání rezervace
        rezervaces.clear();
    }

    public int isPracovniPobyt() {
        int pocet = 0;
        for (Rezervace rezervace : rezervaces) {
            if (rezervace.isPracovniPobyt()) {
                pocet++;
            }
        }

        return pocet;
    }

    public int getPocetHostu() {
        int celkovyPocetHostu = 0;
        for (int i = 0; i <rezervaces.size();i++) {
           celkovyPocetHostu = getRezervace(i).getPocetHostu() + celkovyPocetHostu;


        }
        return celkovyPocetHostu;
    }

    public double getPrumPocetHostu(){
        double i;
        i=getPocetHostu() / rezervaces.size();
        return i;
    }

}