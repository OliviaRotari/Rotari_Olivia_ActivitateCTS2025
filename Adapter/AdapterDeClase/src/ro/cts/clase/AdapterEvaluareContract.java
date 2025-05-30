package ro.cts.clase;

public class AdapterEvaluareContract extends EvaluareContractAsiguratorA implements IEvaluareContractAsiguratorB{
    @Override
    public void analizaContractB(Contract contract) {
        System.out.println("Metoda analiza Contract de catre firma B");
        this.analizaContractA(costTotalFromContract(contract));
    }
    public int costTotalFromContract(Contract contract){
        int total=0;
        for(int i=0; i<contract.getNrMasini();i++){
            total += contract.getCostAchizitie()[i];
        }
        return total;
    }
}
