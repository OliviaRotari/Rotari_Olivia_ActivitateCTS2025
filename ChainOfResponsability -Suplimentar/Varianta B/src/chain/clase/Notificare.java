package chain.clase;

public abstract class Notificare {
 protected Notificare urmNotificare;

    public Notificare getUrmNotificare() {
        return urmNotificare;
    }

    public void setUrmNotificare(Notificare urmNotificare) {
        this.urmNotificare = urmNotificare;
    }

    public abstract void notifica(Client client, String mesaj);
}
