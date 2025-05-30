package facade.clase;

public class Sala {
    private String nume;

    public Sala(String nume) {
        this.nume = nume;
    }
    public void aprindeLumina(){
        System.out.println("In sala " + nume + "se aprinde lumina");
    }
    public void stingeLumina(){
        System.out.println("In sala " + nume +"se stinge lumina");
    }
    public void deschideUsa(){
        System.out.println("S-a deschis usa pentru sala " +nume);
    }
    public void inchideUsa(){
        System.out.println("Pentru sala " + nume + "se inchide usa");
    }
}
