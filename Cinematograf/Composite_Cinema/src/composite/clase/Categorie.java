package composite.clase;

import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;
import java.util.List;

public class Categorie implements INod{
    private String numeCategorie;
    List<INod> subnoduri=new ArrayList<>();

    public Categorie(String numeCategorie) {
        super();
        this.numeCategorie = numeCategorie;
    }


    @Override
    public void printeazaDescriere(String spatii) {
        System.out.println(spatii+ " Categoria: " + numeCategorie + " contine: ");
        for(INod nod:subnoduri){
            nod.printeazaDescriere(spatii+ " ");
        }
    }

    @Override
    public void adaugaNod(INod nod) {
        subnoduri.add(nod);
    }

    @Override
    public INod getNod(int i) {
        return subnoduri.get(i);
    }

    @Override
    public void stergeNod(INod nod) {
        subnoduri.remove(nod);
    }
}
