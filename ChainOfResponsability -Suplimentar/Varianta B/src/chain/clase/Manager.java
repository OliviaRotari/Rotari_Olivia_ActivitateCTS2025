package chain.clase;

public class Manager extends Notificare{

    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Clientul" +client.getNume()+" nu este inregistrat si nu poate primi mesajul"+mesaj);
    }
}
