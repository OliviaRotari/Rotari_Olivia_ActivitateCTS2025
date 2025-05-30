package ro.cts.program;

import ro.cts.clase.AngajatFactory;
import ro.cts.clase.IAngajat;
import ro.cts.clase.TipAngajat;

public class TestFactory {
    public static void main(String[] args) {
        //creare Factory pentru angajat
        AngajatFactory factory=new AngajatFactory();
        //creare angajat de tip vanzator;
        IAngajat angajat1=factory.creareAngajat(TipAngajat.VANZATOR,"Popescu Cornel");
        //creare angajat de tip manager
        IAngajat angajat2=factory.creareAngajat(TipAngajat.MANAGER,"Voevozeanu Alin");
        //creare angajat de tip analist;
        IAngajat angajat3=factory.creareAngajat(TipAngajat.ANALIST,"Ionescu Maria");

        System.out.println("Angajat de tip:" + angajat1.getTip());
        System.out.println("Angajat de tip:" + angajat2.getTip());
        System.out.println("Angajat de tip:" + angajat3.getTip());
    }
}
