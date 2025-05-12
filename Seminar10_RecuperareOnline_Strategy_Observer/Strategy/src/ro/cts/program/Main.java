package ro.cts.program;

import ro.cts.clase.Calator;
import ro.cts.clase.CardCalatorie;
import ro.cts.clase.IMetodaPlata;
import ro.cts.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata cardCalatorie = new CardCalatorie(2);
        IMetodaPlata plataSMS = new PlataSMS();

        Calator calator = new Calator("Maria");
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(cardCalatorie);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(plataSMS);
        calator.platesteCalatorie(3);
    }
}