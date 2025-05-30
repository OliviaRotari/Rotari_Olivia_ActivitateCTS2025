package chain.program;

import chain.clase.*;

public class Main {
    public static void main(String[] args) {
        Comanda c1=new Comanda(170);
        Comanda c2=new Comanda(62);

        Autobuz autobuz1=new Autobuz1();
        Autobuz2 autobuz2=new Autobuz2();
        Autobuz3 autobuz3=new Autobuz3();

        autobuz1.setUrmAutobuz(autobuz2);
        autobuz2.setUrmAutobuz(autobuz3);

        autobuz1.anuntaAutobuz(c1);
        autobuz2.anuntaAutobuz(c2);
        autobuz1.anuntaAutobuz(c2);
    }
}
