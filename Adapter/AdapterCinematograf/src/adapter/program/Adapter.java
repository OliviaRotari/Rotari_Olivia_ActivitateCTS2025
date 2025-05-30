package adapter.program;

import adapter.clase.Film;
import adapter.clase.IFilm;
import adapter.clase.PeliculaAdaptata;

public class Adapter {
    private static void rulezaFilm(IFilm film){
        film.pornesteFilm();
        film.opresteFilm();
    }

    public static void main(String[] args) {
        IFilm film=new Film("Ursul");
        IFilm pelicula=new PeliculaAdaptata("Apele tac");

        rulezaFilm(film);
        rulezaFilm(pelicula);
    }
}
