package Singleton.atribute;

public class EnumInitialization {

    //public static final Singleton.atribute.EnumInitialization instance = new Singleton.atribute.EnumInitialization();

    public enum Initialization{

        INSTANCE;

        String name;

        public void setName(String name){
            this.name = name;
        }

        public void getName(){
            System.out.println("Salut Eu sunt Obiect " +this.name);
        }
    }

    public static void main(String[] args) {

        Initialization initialization = Initialization.INSTANCE;
        Initialization initialization2 = Initialization.INSTANCE;
        initialization.setName("Andrei");
        initialization2.setName("Petru");
        initialization.getName();
    }
}
