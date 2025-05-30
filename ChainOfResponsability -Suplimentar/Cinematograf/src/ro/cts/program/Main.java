package ro.cts.program;


import ro.cts.clase.*;

public class Main {

    public static void main(String[] args) {
        ANotificare SMS=new NotificareSMS();
        ANotificare mail=new NotificareEmail();
        ANotificare manager=new NotificareManager();
        SMS.setOperatiaUrmatoare(mail);
        mail.setOperatiaUrmatoare(manager);
        Client c1=new Client("Popescu","07222454655","popescu@mail.com" );
        Client c2=new Client("Ionescu");
        c2.setAdresa_mail("ionescu@mail.ro");
        Client c3=new Client("Vasilescu");
        String mesaj=" Incepand de azi cinematograful nostru prezinta filme 3D ";

        SMS.notifica(c1,mesaj);
        SMS.notifica(c2, mesaj);
        SMS.notifica(c3,mesaj);

    }
}