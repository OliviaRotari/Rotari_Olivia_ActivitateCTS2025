package adapterDeObiecte.program;


import adapterDeObiecte.clase.AdaptorEvaluareContract;
import adapterDeObiecte.clase.Contract;
import adapterDeObiecte.clase.EvaluareContractAsiguratorA;

public class Main {
    public static void main(String[] args) {
        int[] costuriAchzitii=new int[]{1000,2000,20000,1000,5000};
        Contract contract=new Contract("XYX S.A", 5, costuriAchzitii);

        EvaluareContractAsiguratorA evaluareAsiguratorA=new EvaluareContractAsiguratorA();
        AdaptorEvaluareContract evaluareContract=new AdaptorEvaluareContract(evaluareAsiguratorA);

        evaluareContract.analizaContractB(contract);
    }
}
