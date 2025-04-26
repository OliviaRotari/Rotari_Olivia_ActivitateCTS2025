package FacadeRestaurant.program;

import FacadeRestaurant.clase.Facade;
import FacadeRestaurant.clase.Masa;
import FacadeRestaurant.clase.Ospatar;
import FacadeRestaurant.clase.Picolo;

public class Program {
    public static void main(String[] args) {
        Masa masa = new Masa(4 , true);
        Facade facade = new Facade();
        System.out.println(facade.verificaAsezareMasa(masa));

        Masa masa1 = new Masa(7, true);
        System.out.println(facade.verificaAsezareMasa(masa1));

        Masa masa2 = new Masa(8, false);
        System.out.println(facade.verificaAsezareMasa(masa2));
    }
}