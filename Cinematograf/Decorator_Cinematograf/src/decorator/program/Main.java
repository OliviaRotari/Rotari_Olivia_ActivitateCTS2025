package decorator.program;

import decorator.clase.AFilmInbunatatit;
import decorator.clase.Film;
import decorator.clase.FilmInbunatatit;
import decorator.clase.IFilm;

public class Main {
    public static void main(String[] args) {
        IFilm film=new Film("Titanic");
        film.pornesteFilm();
        film.opresteFilm();

        AFilmInbunatatit filmInbunatatit=new FilmInbunatatit(film);
        filmInbunatatit.pornesteFilm();
        filmInbunatatit.pauza();
        filmInbunatatit.resume();
        filmInbunatatit.opresteFilm();
    }
}
