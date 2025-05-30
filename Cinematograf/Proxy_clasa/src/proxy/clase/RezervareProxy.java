package proxy.clase;

public class RezervareProxy implements IRezervare{
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }


    @Override
    public void realizeazaRezervare(String numeClient, int nrPerasoane) {
        if(nrPerasoane>=4){
            rezervare.realizeazaRezervare(numeClient, nrPerasoane);
        }else{
            System.out.println("Nu este permisa rezervarea");
        }
    }
}
