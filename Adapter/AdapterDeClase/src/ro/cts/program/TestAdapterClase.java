package ro.cts.program;

import ro.cts.clase.AdapterEvaluareContract;
import ro.cts.clase.Contract;
import ro.cts.clase.IEvaluareContractAsiguratorB;

import java.lang.module.Configuration;

public class TestAdapterClase {
    public static void main(String[] args) {
        int[] costuriAchizitii=new int[]{1000,2000,20000,1000,5000};
        Contract contract =new Contract("XYX S.A.",5,costuriAchizitii);
        IEvaluareContractAsiguratorB evaluareContractB =new AdapterEvaluareContract();
        evaluareContractB.analizaContractB(contract);
    }
}
