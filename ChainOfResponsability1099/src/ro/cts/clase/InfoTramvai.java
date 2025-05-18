package ro.cts.clase;

public class InfoTramvai extends AInfoTransport{
    @Override
    public void recomandaTranspot(int distanta) {
        if(distanta<10){
            System.out.println("Recomand sa alegeti Tramvaiul ca mijloc de transport");
        }
        else {
            super.getNext().recomandaTranspot(distanta);
        }
    }
}
