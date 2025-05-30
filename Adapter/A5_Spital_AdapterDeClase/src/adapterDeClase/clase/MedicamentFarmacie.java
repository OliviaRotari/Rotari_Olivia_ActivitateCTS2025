package adapterDeClase.clase;

public class MedicamentFarmacie implements IMedicamentFarmacie{
    private String denumire;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String denumire, float pret, boolean esteInStoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    @Override
    public void cumparaMedicament() {
     if (esteInStoc){
         System.out.println("Se cumpara medicamentul " + denumire + " la pretul de " + pret + "RON");
     }else{
         System.out.println("Medicamentul " + denumire + " nu este in stocul farmaciei ");
     }
    }
}
