package ro.cts.program;

import ro.cts.clase.ConfigurareContractAsigurari;
import ro.cts.clase.ContractAsigurare;
import ro.cts.clase.ContractAsigurareBuilder;

public class TestBuilder {
    public static void main(String[] args) {
        ContractAsigurareBuilder builder=new ContractAsigurareBuilder("Popescu Ion");
        ConfigurareContractAsigurari configurator=new ConfigurareContractAsigurari(builder);
        configurator.build();
        ContractAsigurare contract=configurator.getContract();
    }
}
