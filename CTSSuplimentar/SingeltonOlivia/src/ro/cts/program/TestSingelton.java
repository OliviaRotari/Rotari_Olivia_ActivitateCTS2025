package ro.cts.program;

import ro.cts.clase.SingeltonClauzeRCA;

public class TestSingelton {
    public static void main(String[] args)throws Exception {
        SingeltonClauzeRCA clauzeRCA1=SingeltonClauzeRCA.getInstance();
        SingeltonClauzeRCA clauzeRCA2=SingeltonClauzeRCA.getInstance();

        if(clauzeRCA1==clauzeRCA2){
            System.out.println("Referinte identice");
        }
        else{
            System.out.println("Referintele nu sunt identice");
        }

        clauzeRCA1.setLimitaMaximaAsigurareAutoturiste(5000);
        System.out.println(clauzeRCA1.getLimitaMaximaAsigurareAutoturiste());
        System.out.println(clauzeRCA2.getLimitaMaximaAsigurareAutoturiste());
    }

}
