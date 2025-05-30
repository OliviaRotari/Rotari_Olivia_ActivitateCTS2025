package strategy.clase;

public class Calator {
   private String numeCamator;
   private IMetodaPlata metodaPlata;

    public Calator(String numeCamator) {
        this.numeCamator = numeCamator;
        this.metodaPlata=new CardBancar(8);
    }

    public Calator(String numeCamator, IMetodaPlata metodaPlata) {
        this.numeCamator = numeCamator;
        this.metodaPlata = metodaPlata;
    }


    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public  void platesteCalatoria(float pretBilet ){
        metodaPlata.plateste(pretBilet);
    }
}
