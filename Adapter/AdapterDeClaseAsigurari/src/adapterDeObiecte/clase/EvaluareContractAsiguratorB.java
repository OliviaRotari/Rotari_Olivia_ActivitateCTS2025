package adapterDeObiecte.clase;

import adapterDeObiecte.clase.Contract;
import adapterDeObiecte.clase.IEvaluareContractAsiguratorB;

public class EvaluareContractAsiguratorB implements IEvaluareContractAsiguratorB {
    @Override
    public void analizaContractB(Contract contract) {
        System.out.println("Metoda analiza Contract de catre firma B");
        int total=0;
        for(int i=0; i<contract.getNrMasini();i++){
            total+=contract.getCostAchizitie()[i];
        }
        System.out.println("Costul aferent contractului este "+ total*0.05);
    }
}
