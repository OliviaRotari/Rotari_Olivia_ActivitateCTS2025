package adapterDeObiecre.clase;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class MedicamentFarmacie {
    private String denumire;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String denumire, float pret, boolean esteInStoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicamet(){
        if(esteInStoc){
            System.out.println("Se cumpara mediacamentul " + denumire + " la pretul de " +pret+ " RON");
        }else{
            System.out.println("Medicamentul " + denumire + " nu este in stocul farmaciei" );
        }
    }
}
