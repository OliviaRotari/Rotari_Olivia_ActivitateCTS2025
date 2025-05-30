package chain.clase;

public class Autobuz3 extends Autobuz{

    @Override
    public void anuntaAutobuz(Comanda comanda) {
        if(isDisponibil())
        {
            System.out.println("Autobuzul 3 preia cursa cu linia"+comanda.getNrLinie());
            this.devineOcupat();
        }
        else{
            System.out.println("Nu mai avem autobuze disponibile in flota");
        }
    }
}
