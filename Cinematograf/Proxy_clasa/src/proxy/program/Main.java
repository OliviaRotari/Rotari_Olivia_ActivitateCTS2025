package proxy.program;

import proxy.clase.IRezervare;
import proxy.clase.ProxyNumeClient;
import proxy.clase.Rezervare;
import proxy.clase.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare=new Rezervare();
        IRezervare proxy=new RezervareProxy(rezervare);
        proxy.realizeazaRezervare("Mihai Popescu", 2);
        proxy.realizeazaRezervare("Dorin Petrescu", 5);

        IRezervare proxyCompus=new ProxyNumeClient(proxy);
        proxyCompus.realizeazaRezervare("Pop Irina", 2);
        proxyCompus.realizeazaRezervare("Pop", 5);
        proxyCompus.realizeazaRezervare("Pop Irina", 5);
    }
}
