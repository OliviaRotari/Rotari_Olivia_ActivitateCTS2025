package decorator.clase;

public class Film implements IFilm{
    private String numeFilm;

    @Override
    public void pornesteFilm() {
        System.out.println("A inceput filmul " + numeFilm);
    }

    @Override
    public void opresteFilm() {
        System.out.println("Filmul " + numeFilm + " s-a terminat");
    }

    @Override
    public String getNumeFilm() {
        return numeFilm;
    }

    public void setNumeFilm(String numeFilm) {
        this.numeFilm = numeFilm;
    }

    public Film(String numeFilm) {
        super();
        this.numeFilm = numeFilm;
    }


}
