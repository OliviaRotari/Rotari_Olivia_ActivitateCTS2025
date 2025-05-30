package chain.clase;

public class Autobuz2 extends Autobuz{

    @Override
    public void anuntaAutobuz(Comanda comanda) {
        if(isDisponibil())
        {
            System.out.println("Autobuzul 2 preia cursa cu linia "+comanda.getNrLinie());
            this.devineOcupat();
        }else {
            this.getUrmAutobuz().anuntaAutobuz(comanda);
        }
    }
}
