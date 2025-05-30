package proxy.clase;

public class ProxyFilm implements   IFilm{

    private Film film=null;
    private String denumireFilm;
    private String sala;

    public ProxyFilm(String denumireFilm, String sala) {
        super();
        this.denumireFilm = denumireFilm;
        this.sala = sala;
    }


    @Override
    public void ruleazafilm() {
        if(film==null){
            film=new Film(denumireFilm, sala);
            film.ruleazafilm();
        }
    }
}
