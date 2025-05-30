package proxy.clase;

public class ProxyNumeClient implements IRezervare {
    private IRezervare rezervare;

    public ProxyNumeClient(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int nrPerasoane) {
        if(numeClient.length()>5){
            this.rezervare.realizeazaRezervare(numeClient, nrPerasoane);
        }else{
            System.out.println( "Nu este permisa rezervarea");
        }
    }
}