package ro.cts.clase;

public class Autobuz extends InfoMijloc{
    @java.lang.Override
    public void recomandareMijloc(int distanta) {
        if(distanta<5){
            System.out.println("Calatorul va lua autobuzul");
        }
        else {
            this.getUrmMijloc().recomandareMijloc(distanta);
        }
    }
}
