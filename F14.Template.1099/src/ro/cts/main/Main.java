package ro.cts.main;

import ro.cts.clase.Tramvai;
import ro.cts.clase.TramvaiAbs;
import ro.cts.clase.TramvaiTemporar;

public class Main {
    public static void main(String[] args) {
        TramvaiAbs tramvai = new Tramvai(3);
        TramvaiAbs tramvaiTemp = new TramvaiTemporar(5);

        tramvai.parcurgereTur();
        System.out.println();
        tramvai.parcurgereRetur();
        System.out.println();
        tramvaiTemp.parcurgereTur();
        System.out.println();
        tramvaiTemp.parcurgereRetur();
    }
}
