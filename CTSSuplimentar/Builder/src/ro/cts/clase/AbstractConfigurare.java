package ro.cts.clase;

public abstract class AbstractConfigurare {
    public abstract void adaugaAsigurareAuto(IAsigurareAuto asigurareAuto);
    public abstract void adaugaAsigurarePoductie(IAsigurareProductie asigurareProductie);
    public abstract void adaugaAsigurareServicii(IAsigurareServicii asigurareServicii);
    public abstract ContractAsigurare getContract();
}
