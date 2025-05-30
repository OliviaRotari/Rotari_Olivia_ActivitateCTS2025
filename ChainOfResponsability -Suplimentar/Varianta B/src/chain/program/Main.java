package chain.program;

import chain.clase.*;

public class Main {
    public static void main(String[] args) {
        Client c1=new Client("Marian", "0987657654","marian@gmail.com");
        Client c2=new Client("Bianca");
        Client c3=new Client("Gabriela");

        Notificare sms=new SMS();
        Notificare email=new Email();
        Notificare manager=new Manager();

        sms.setUrmNotificare(email);
        email.setUrmNotificare(manager);

        c2.setEmail("bianca@gmail");
        String mesaj="Nu parcati";
        sms.notifica(c1, "Ati fost cazat la 202");
        sms.notifica(c2,"Aveti o scurgere");
        email.notifica(c3, "Aveti un discaunt la spa");
        sms.notifica(c1, mesaj);

    }
}