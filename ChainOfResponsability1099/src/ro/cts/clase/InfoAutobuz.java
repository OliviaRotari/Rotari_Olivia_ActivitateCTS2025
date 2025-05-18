package ro.cts.clase;

public class InfoAutobuz extends AInfoTransport{
    @Override
    public void recomandaTranspot(int distanta) {
        if(distanta<5){
            System.out.println("Recomand sa alegeti ca mijloc de transport autobuzul");
        }
        else {
            super.getNext().recomandaTranspot(distanta);
        }
    }
}
