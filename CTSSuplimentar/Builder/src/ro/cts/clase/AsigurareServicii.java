package ro.cts.clase;

public class AsigurareServicii implements IAsigurareServicii{
    int nrContacte;

    public AsigurareServicii(int nrContacte) {
        this.nrContacte = nrContacte;
    }

    public int getNrContacte() {
        return nrContacte;
    }

    public void setNrContacte(int nrContacte) {
        this.nrContacte = nrContacte;
    }
}
