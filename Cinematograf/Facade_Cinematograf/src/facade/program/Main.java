package facade.program;

import facade.clase.Cinema;

public class Main {
    public static void main(String[] args) {
        Cinema cinema=new Cinema();
        cinema.difuzareFilmInSala("Sergiu Nicolaescu", "Titanic");
    }
}
