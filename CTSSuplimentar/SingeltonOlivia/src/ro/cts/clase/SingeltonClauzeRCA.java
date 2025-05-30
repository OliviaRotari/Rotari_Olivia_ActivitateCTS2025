package ro.cts.clase;

public class SingeltonClauzeRCA {
    private static SingeltonClauzeRCA instance=null;
    private int limitaMaximaAsigurareCamion=2500;
    private int limitaMaximaAsigurareAutoturiste=2000;

    public int getLimitaMaximaAsigurareAutoturiste() {
        return limitaMaximaAsigurareAutoturiste;
    }

    public void setLimitaMaximaAsigurareAutoturiste(int limitaMaximaAsigurareAutoturiste) {
        this.limitaMaximaAsigurareAutoturiste = limitaMaximaAsigurareAutoturiste;
    }

    public int getLimitaMaximaAsigurareCamion() {
        return limitaMaximaAsigurareCamion;
    }

    public void setLimitaMaximaAsigurareCamion(int limitaMaximaAsigurareCamion) {
        this.limitaMaximaAsigurareCamion = limitaMaximaAsigurareCamion;
    }

    private SingeltonClauzeRCA()throws Exception{
        if(instance!=null)
            throw new Exception("Obiect singelton deja creat");
    }
    public static SingeltonClauzeRCA getInstance()throws Exception{
        if(instance==null)
            instance=new SingeltonClauzeRCA();
        return instance;
    }
}
