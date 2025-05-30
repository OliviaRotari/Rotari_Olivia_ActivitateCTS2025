package chain.main;

import chain.clase.Alerta;
import chain.clase.BrokerAsigurari;
import chain.clase.CEORomania;
import chain.clase.Manager;

public class Program {
    public static void main(String[] args) {
        BrokerAsigurari brokerAsigurari=new BrokerAsigurari();
        Manager manager=new Manager();
        CEORomania ceoRomania=new CEORomania();

        //gestionarea lantului de tratare a alertelor
        brokerAsigurari.setSuccesor(manager);
        manager.setSuccesor(ceoRomania);

        Alerta a1=new Alerta(70,"Inundatii in judetull Ilfov");
        Alerta a2=new Alerta(3, "Schimbare nume contact pe contractul X152");
        Alerta a3=new Alerta(8,"Modifica procent daune asigurare dezastre naturale");

        System.out.println("ALERTA-"+a1.getMesaj());
        brokerAsigurari.procesareCerere(a1);
        System.out.println("\nALERTA-"+a2.getMesaj());
        brokerAsigurari.procesareCerere(a2);
        System.out.println("\nALERTA-"+a3.getMesaj());
        brokerAsigurari.procesareCerere(a3);
    }
}
