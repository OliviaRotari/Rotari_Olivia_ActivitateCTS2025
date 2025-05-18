package ro.cts.clase;

public class InfoTroleibuz extends AInfoTransport{
    @Override
    public void recomandaTranspot(int distanta) {
        if(distanta<3){
            System.out.println("Va recomandam sa luati troleibuz ca mijloc");
        }
        else
        {
            super.getNext().recomandaTranspot(distanta);
        }
    }
}
