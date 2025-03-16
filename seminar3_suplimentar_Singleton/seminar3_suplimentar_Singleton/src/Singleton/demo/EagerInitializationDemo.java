package Singleton.demo;

import Singleton.atribute.EagerInitialization;

public class EagerInitializationDemo {
    public static void main(String[] args){
        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();

        System.out.println(eagerInitialization.toString());
        System.out.println(eagerInitialization2.toString());
    }
}
