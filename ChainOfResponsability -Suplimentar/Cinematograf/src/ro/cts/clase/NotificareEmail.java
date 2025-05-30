package ro.cts.clase;

public class NotificareEmail extends ANotificare{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getAdresa_mail()!=null){
            System.out.println(client.getNume()+" ai un Email cu mesajul "+mesaj);
        }else super.operatiaUrmatoare.notifica(client, mesaj);
    }
}
