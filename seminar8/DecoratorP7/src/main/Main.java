package main;

import decorator.NotaAnNou;
import decorator.NotaCraciun;
import models.Nota;
import models.NotaPlata;

public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaPlata(150);
        nota.printare();
        System.out.println();
        Nota notaDecorata = new NotaAnNou(nota);
        notaDecorata.printare();
        System.out.println();
        Nota notaCraciun = new NotaCraciun(notaDecorata);
        notaCraciun.printare();
    }
}
