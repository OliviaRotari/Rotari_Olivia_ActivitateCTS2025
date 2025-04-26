package decorator;

import models.Nota;

public class NotaAnNou extends NotaDecorata{

    public NotaAnNou(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani!");
    }
}
