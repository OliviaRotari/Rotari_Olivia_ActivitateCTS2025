package chain.clase;

public class Autobuz1 extends Autobuz{

    @Override
    public void anuntaAutobuz(Comanda comanda) {
        if(isDisponibil()){
            System.out.println("Autobuzul 1 preia cursa cu linia "+comanda.getNrLinie());
        this.devineOcupat();
        }
        else{
            this.getUrmAutobuz().anuntaAutobuz(comanda);
        }
    }
}
