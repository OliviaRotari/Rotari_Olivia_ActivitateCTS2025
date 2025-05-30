package ro.cts.clase;

public class ConfigurareContractAsigurari {
    AbstractConfigurare builder;

    public ConfigurareContractAsigurari(AbstractConfigurare builder) {
        this.builder = builder;
    }

    public ContractAsigurare getContract() {
       return this.builder.getContract();
    }
    public void build(){
        System.out.println("Configurare Contract Asigurari");
        this.builder.adaugaAsigurareAuto(new AsigurareAutoRCA(10));
        this.builder.adaugaAsigurarePoductie(new AsigurareProductie(1000));
        this.builder.adaugaAsigurareServicii(new AsigurareServicii(100));
    }
}
