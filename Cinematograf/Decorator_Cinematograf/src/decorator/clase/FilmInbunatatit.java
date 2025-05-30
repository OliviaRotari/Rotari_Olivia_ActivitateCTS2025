package decorator.clase;

public class FilmInbunatatit extends AFilmInbunatatit{
    public FilmInbunatatit(IFilm film) {
        super(film);
    }

    @Override
    public void pauza() {
        System.out.println("Filmul " + super.getNumeFilm() + " a intrat in pauza");
    }

    @Override
    public void resume() {
        System.out.println("Filmul " + super.getNumeFilm() + " a reinceput");
    }
}
