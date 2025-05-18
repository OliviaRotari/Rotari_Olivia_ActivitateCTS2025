package ro.cts.clase;

public class TramvaiTemporar extends TramvaiAbs{
    private  int nrTramvai;

    public TramvaiTemporar(int nrTramvai) {
        this.nrTramvai = nrTramvai;
    }

    @Override
    protected void opresteStatie1() {
        System.out.println("Tramvaiul "+nrTramvai+" a oprit in statia 1");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Tramvaiul "+nrTramvai+" a oprit in statia 2");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Tramvaiul "+nrTramvai+" nu opreste in statia 3, SUNT LUCRARI");
    }

    @Override
    protected void opresteStatie4() {
        System.out.println("Tramvaiul "+nrTramvai+" a oprit in statia 4");
    }

    @Override
    protected void opresteStatie5() {
        System.out.println("Tramvaiul "+nrTramvai+" nu opreste in statia 5, SUNT LUCRARI");
    }

}
