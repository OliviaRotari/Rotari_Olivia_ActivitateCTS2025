package adapterDeClase.program;

import adapterDeClase.clase.AdapterClaseMedicament;
import adapterDeClase.clase.Farmacie;
import adapterDeClase.clase.IMedicamentFarmacie;
import adapterDeClase.clase.MedicamentFarmacie;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie=new Farmacie("Catena");
        IMedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie("Sirop tuse", 25, true);
        IMedicamentFarmacie medicamentFarmacie1=new MedicamentFarmacie("Picaturi",30, false);

        farmacie.vindeMedicamet(medicamentFarmacie);
        farmacie.vindeMedicamet(medicamentFarmacie1);

        AdapterClaseMedicament adater=new AdapterClaseMedicament("Paracetamol", 15);
        farmacie.vindeMedicamet(adater);
        adater.achizitioneazaMedicament();
    }
}
