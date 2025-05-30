package adapterDeClase.clase.program;

import adapterDeClase.clase.clase.AdaptorEvaluareContract;
import adapterDeClase.clase.clase.Contract;
import adapterDeClase.clase.clase.IEvaluareContractAsiguratorB;

public class Main {
    public static void main(String[] args) {
     int[] costuriAchzitii=new int[]{1000,2000,20000,1000,5000};
        Contract contract=new Contract("XYX S.A", 5, costuriAchzitii);
        IEvaluareContractAsiguratorB evaluareContractB=new AdaptorEvaluareContract();
        evaluareContractB.analizaContractB(contract);
    }
}