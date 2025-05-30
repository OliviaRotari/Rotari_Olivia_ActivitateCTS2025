package proxy.program;

import proxy.clase.ProxyFilm;

public class Main {
    public static void main(String[] args) {
        ProxyFilm film=new ProxyFilm("Ursul", "Dem Radulescu");
        System.out.println("Filmul nu a fost incarcat in memorie");
        film.ruleazafilm();
    }
}