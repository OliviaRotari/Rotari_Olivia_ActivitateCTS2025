package Singleton.demo;

import Singleton.atribute.EnumInitialization;

public class EnumInitializationDemo {
    public static void main(String[] args) {

        EnumInitialization.Initialization initialization = EnumInitialization.Initialization.INSTANCE;
        initialization.setName("Tudor");
    }
}
