package adapterDeObiecre.program;

import adapterDeObiecre.clase.AdapterMedicamente;
import adapterDeObiecre.clase.MedicamentFarmacie;
import adapterDeObiecre.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("\nFarmacia noastra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicamet();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie1=new MedicamentFarmacie("Sirop", 20.34f, true);
        MedicamentFarmacie medicamentFarmacie2=new MedicamentFarmacie("Aspirina", 10, true);
        vindeMedicament(medicamentFarmacie1);
        vindeMedicament(medicamentFarmacie2);


        MedicamentSpital medicamentSpital1=new MedicamentSpital("Ibuprofen", 34.50f);
        MedicamentSpital medicamentSpital2=new MedicamentSpital("NoSpa", 32.99f);
        vindeMedicament(new AdapterMedicamente(medicamentSpital1));
        vindeMedicament(new AdapterMedicamente(medicamentSpital2));
    }
}
