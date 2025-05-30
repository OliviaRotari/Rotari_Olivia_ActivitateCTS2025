package flyweight.clase;

public class Film implements IFilm{
    public  String denumire;

    public Film(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void ruleaza(Sala sala) {
        System.out.println(denumire+ "  a inceput la sala "+ sala.getNrSala());
    }
}
