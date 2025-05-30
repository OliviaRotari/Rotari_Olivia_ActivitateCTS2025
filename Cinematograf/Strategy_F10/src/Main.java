import strategy.clase.Calator;
import strategy.clase.CardCalatorie;
import strategy.clase.IMetodaPlata;
import strategy.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata cardCalatoie=new CardCalatorie(2);
        IMetodaPlata plataSMS=new PlataSMS();

        Calator calator=new Calator("Maria");
        calator.platesteCalatoria(3);

        calator.setMetodaPlata(cardCalatoie);
        calator.platesteCalatoria(3);
        calator.platesteCalatoria(3);
        calator.platesteCalatoria(3);
        calator.setMetodaPlata(plataSMS);
        calator.platesteCalatoria(3);


    }
}