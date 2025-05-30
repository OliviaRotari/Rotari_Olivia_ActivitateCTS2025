package adapter.program;

import adapter.clase.AdapterPelicula;
import adapter.clase.Film;
import adapter.clase.IFilm;

public class Main {

    public static void ruleazaFilm(IFilm film){
        film.pornesteFilm();
        film.opresteFilm();
    }

    public static void main(String[] args) {
        IFilm film=new Film("Ursul");
        IFilm pelicula=new AdapterPelicula("Apele tac");

        ruleazaFilm(film);
        ruleazaFilm(pelicula);
    }
}
