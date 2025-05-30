package flyweight.clase;

public class Sala {
    private int nrSala;

    public Sala(int nrSala) {
        this.nrSala = nrSala;
    }

    public int getNrSala() {
        return nrSala;
    }

    public void setNrSala(int nrSala) {
        this.nrSala = nrSala;
    }

    public Sala(){
        this.nrSala=8;
    }

    @Override
    public String toString() {
        return "Sala [numar Sala " + nrSala + "]";
    }
}
