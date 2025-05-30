package proxy.clase;

public class Rezervare implements IRezervare{
    @Override
    public void realizeazaRezervare(String numeClient, int nrPerasoane) {
        System.out.println("Rezervare realizata pentru: " + numeClient + "-" + nrPerasoane + " persoane");
    }
}
