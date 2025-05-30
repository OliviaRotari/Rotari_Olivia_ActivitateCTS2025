package adapterDeClase.clase;



public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicamet(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("\nFarmacia " + nume + " va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicament();
    }

}
