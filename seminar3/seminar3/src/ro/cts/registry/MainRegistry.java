package ro.cts.registry;

public class MainRegistry {
    public static void  main(String[] args) {
       Autoritate autoritate = Autoritate.getInstance("Autoritate", "www.site.ro");
       Reglementare  reglementare1 = autoritate.reglementareModel("Dagia Logan");
       Reglementare reglementare2= autoritate.reglementareModel("Tesla Cybertruck");
        System.out.println(reglementare1);
        System.out.println(reglementare2);
        Reglementare reglementare3 = autoritate.reglementareModel("Dacia Logan");
        System.out.println(reglementare3);
    }
}
