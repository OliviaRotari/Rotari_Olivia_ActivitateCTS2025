package ro.cts.clase;

public abstract class ANotificare {
    protected ANotificare operatiaUrmatoare;

    public void setOperatiaUrmatoare(ANotificare operatiaUrmatoare) {
        this.operatiaUrmatoare = operatiaUrmatoare;
    }

    public abstract void notifica(Client client, String mesaj);
}
