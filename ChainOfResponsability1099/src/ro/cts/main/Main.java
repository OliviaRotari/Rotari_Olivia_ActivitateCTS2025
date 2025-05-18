package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        AInfoTransport troleibuz= new InfoTroleibuz();
        AInfoTransport tramvai= new InfoTramvai();
        AInfoTransport metrou= new InfoMetrou();

        troleibuz.setNext(tramvai);
        tramvai.setNext(metrou);

        troleibuz.recomandaTranspot(2);
        troleibuz.recomandaTranspot(12);
        troleibuz.recomandaTranspot(7);
        troleibuz.recomandaTranspot(4);

    }
}
