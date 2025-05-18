package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        InfoMijloc troleibuz= new Troleibuz();
        InfoMijloc autobuz= new Autobuz();
        InfoMijloc tramvai = new Tramvai();
        InfoMijloc metrou= new Metrou();

        troleibuz.setUrmMijloc(autobuz);
        autobuz.setUrmMijloc(tramvai);
        tramvai.setUrmMijloc(metrou);
        metrou.setUrmMijloc(null);

        troleibuz.recomandareMijloc(5);
        troleibuz.recomandareMijloc(2);
        troleibuz.recomandareMijloc(12);
        troleibuz.recomandareMijloc(4);

    }
}
