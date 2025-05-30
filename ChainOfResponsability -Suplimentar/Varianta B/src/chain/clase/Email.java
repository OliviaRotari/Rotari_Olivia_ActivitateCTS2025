package chain.clase;

public class Email extends Notificare{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail()!=null){
            System.out.println("Clientul "+client.getNume()+" a primit un email cu mesajul"+mesaj);
        }
        else{
            super.getUrmNotificare().notifica(client,mesaj);
        }
    }
}
