package ro.cts.clase;

public class SingeltonClauzeRCA {

    //referinta la instanta unica;
    private static SingeltonClauzeRCA instance=null;
    private int limitaMaximaAsigurareCamioane=2500;
    private int limitaMaximaAsigurareAutoturisme=2000;


    public int getLimitaMaximaAsigurareCamioane() {
        return limitaMaximaAsigurareCamioane;
    }

    public void setLimitaMaximaAsigurareCamioane(int limitaMaximaAsigurareCamioane) {
        this.limitaMaximaAsigurareCamioane = limitaMaximaAsigurareCamioane;
    }

    public int getLimitaMaximaAsigurareAutoturisme() {
        return limitaMaximaAsigurareAutoturisme;
    }

    public void setLimitaMaximaAsigurareAutoturisme(int limitaMaximaAsigurareAutoturisme) {
        this.limitaMaximaAsigurareAutoturisme = limitaMaximaAsigurareAutoturisme;
    }

    //constructor privat
    private SingeltonClauzeRCA()throws Exception{
        if(instance!=null){
            throw new Exception("Obiect singelton deja creiat");
        }
    }

    //metoda publica
    public static SingeltonClauzeRCA getInstance() throws Exception{
        if(instance==null)
            instance=new SingeltonClauzeRCA();
        return instance;
    }
}
