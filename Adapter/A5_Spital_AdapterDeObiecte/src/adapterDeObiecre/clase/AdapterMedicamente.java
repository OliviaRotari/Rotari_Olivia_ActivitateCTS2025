package adapterDeObiecre.clase;

public class AdapterMedicamente extends MedicamentFarmacie{
    private MedicamentSpital medicamet;
    public AdapterMedicamente(String denumire, float pret, boolean esteInStoc) {
        super(denumire, pret, esteInStoc);
    }
    public  AdapterMedicamente(MedicamentSpital medicamet){
        super(medicamet.getDenumire(), medicamet.getPret(), true);
        this.medicamet=medicamet;
    }

    @Override
    public void cumparaMedicamet() {
        medicamet.achizitioneazaMedicament();
    }
}
