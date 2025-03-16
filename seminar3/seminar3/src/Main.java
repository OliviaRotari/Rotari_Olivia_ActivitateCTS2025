import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AutoritateReglementareMasiniEager autoritate=AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2= AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebSite("www.siteNou");
        System.out.println(autoritate2);

        System.out.println(autoritate);

        autoritate2.reglementeazaModel("DaciaLogan");
        System.out.println(autoritate2);

        AutoritateReglementareMasiniLazy autoLazy = AutoritateReglementareMasiniLazy.getInstance("BMW", "www.website.ro");
        System.out.println(autoLazy);

        AutoritateReglementareMasiniLazy autoLazy2= AutoritateReglementareMasiniLazy.getInstance("AutoritateRo", "www.autoritate");
        autoLazy2.setWebSite("www.ceva.com");
        System.out.println(autoLazy2);
        System.out.println(autoLazy);



    }
}