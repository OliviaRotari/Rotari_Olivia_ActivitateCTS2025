package adapter.clase;

public class AdapterPelicula extends Pelicula implements IFilm{
    public AdapterPelicula(String numePelicula) {
        super(numePelicula);
    }

    @Override
    public void pornesteFilm() {
        super.pornestePelicula();
    }

    @Override
    public void opresteFilm() {
        super.oprestePelicula();
    }
}
