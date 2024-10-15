import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private final List<Rezervace> rezervaceList = new ArrayList<>();


    public void addRezervace(Rezervace rezervace) {
        rezervaceList.add(rezervace);
    }


    public Rezervace getRezervace(int index) {
        return rezervaceList.get(index);
    }

    public List<Rezervace> getRezervaceList() {
        return new ArrayList<>(rezervaceList);
    }

    public void clearRezervaceList() {
        rezervaceList.clear();
    }

    public int getPocetRezervaciSPracPobytem() {
        int pocetPracRezervaci = 0;
        for (Rezervace rezervace : rezervaceList) {
            if (rezervace.isPracovniPobyt()) {
                pocetPracRezervaci++;
            }
        }
        return pocetPracRezervaci;
    }

}