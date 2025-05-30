package facade.clase;

public class Cinema {
    private Sala sala;
    private Public publicul;
    private Film film;

    public void difuzareFilmInSala(String numeSala, String numeFilm){
        sala=new Sala(numeSala);
        film=new Film(numeFilm);
        publicul=new Public(3);

        sala.deschideUsa();
        sala.aprindeLumina();
        publicul.publiculIntraInSala();
        sala.inchideUsa();
        sala.stingeLumina();
        film.play();

    }


}
