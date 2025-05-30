package ro.cts.clase;

public class ContractAsigurare {
    String numeClient;

    IAsigurareServicii asigurareServicii;
    IAsigurareAuto asigurareAuto;
    IAsigurareProductie asigurareProductie;


    public ContractAsigurare() {
    }

    public ContractAsigurare(String numeClient, IAsigurareServicii asigurareServicii, IAsigurareAuto asigurareAuto, IAsigurareProductie asigurareProductie) {
        this.numeClient = numeClient;
        this.asigurareServicii = asigurareServicii;
        this.asigurareAuto = asigurareAuto;
        this.asigurareProductie = asigurareProductie;
    }


    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public IAsigurareServicii getAsigurareServicii() {
        return asigurareServicii;
    }

    public void setAsigurareServicii(IAsigurareServicii asigurareServicii) {
        this.asigurareServicii = asigurareServicii;
    }

    public IAsigurareAuto getAsigurareAuto() {
        return asigurareAuto;
    }

    public void setAsigurareAuto(IAsigurareAuto asigurareAuto) {
        this.asigurareAuto = asigurareAuto;
    }

    public IAsigurareProductie getAsigurareProductie() {
        return asigurareProductie;
    }

    public void setAsigurareProductie(IAsigurareProductie asigurareProductie) {
        this.asigurareProductie = asigurareProductie;
    }
}
