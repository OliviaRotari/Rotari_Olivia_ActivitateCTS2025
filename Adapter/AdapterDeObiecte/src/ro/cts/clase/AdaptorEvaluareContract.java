package ro.cts.clase;

public class AdaptorEvaluareContract implements IEvaluareContractAsiguratorB{
    IEvaluareContractAsiguratorA evaluareAsuguratorA;

    public AdaptorEvaluareContract(
            IEvaluareContractAsiguratorA evaluareAsuguratorA) {
        this.evaluareAsuguratorA = evaluareAsuguratorA;
    }

    @Override
    public void analizaContractB(Contract contract) {
        int total=0;
        for(int i=0; i<contract.getNrMasini();i++){
            total += contract.getCostAchizitie()[i];
        }
        evaluareAsuguratorA.analizaContractA(total);
    }
}
