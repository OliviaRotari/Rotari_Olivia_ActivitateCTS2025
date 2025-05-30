package decorator.clase;

public abstract class AFilmInbunatatit implements IFilm {
    private IFilm film;

    public IFilm getFilm() {
        return film;
    }

    public void setFilm(IFilm film) {
        this.film = film;
    }

    public AFilmInbunatatit(IFilm film) {
        this.film = film;
    }

    @Override
    public String getNumeFilm() {
        return film.getNumeFilm();
    }

    @Override
    public void pornesteFilm() {
        film.pornesteFilm();
    }

    @Override
    public void opresteFilm() {
        film.opresteFilm();
    }

    public abstract void pauza();
    public abstract void resume();


}
