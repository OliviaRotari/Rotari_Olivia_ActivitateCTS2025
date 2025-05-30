package ro.cts.clase;

import java.util.HashMap;

public class PrototypeFactory {
    private static HashMap<String,ContractAsigurare> prototipuriContracte=new HashMap<>();

    static {
        //incarcare prototipuri contracte asigurari
        System.out.println("\nInitializare contracte asigurate");
        AsigurareAuto asigurareAuto=new AsigurareAuto();
        asigurareAuto.setId("auto");
        prototipuriContracte.put("auto",asigurareAuto);

        AsigurareLocuinte asigurareLocuinte=new AsigurareLocuinte();
        asigurareLocuinte.setId("locuinta");
        prototipuriContracte.put("locuinta",asigurareLocuinte);
        System.out.println("\n");
    }
    public static ContractAsigurare getPrototip(String id){
        ContractAsigurare copiePrototip=null;
        ContractAsigurare prototip=prototipuriContracte.get(id);
        if(prototip!=null)
            copiePrototip=(ContractAsigurare)  prototip.clone();
        return copiePrototip;
    }
}
