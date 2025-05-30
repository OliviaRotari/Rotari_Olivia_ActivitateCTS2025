package chain.clase;

public class SMS extends Notificare {

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon()!=null){
            System.out.println("Clientul"+client.getNume()+" a primit un SMS "+mesaj);
        }
        else{
            super.getUrmNotificare().notifica(client, mesaj);
        }
    }
}
