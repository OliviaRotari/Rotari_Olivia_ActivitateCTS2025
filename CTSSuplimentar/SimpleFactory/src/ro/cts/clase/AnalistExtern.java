package ro.cts.clase;

public class AnalistExtern extends IAngajat{

    @Override
    public String getTip() {
        return "Analist";
    }

    @Override
    public void afisare(String nume) {
        System.out.println("Analist" + nume);

    }
}
