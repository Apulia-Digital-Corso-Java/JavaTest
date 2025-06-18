package DB;

import Dto.CorsoDTO;

import java.util.ArrayList;
import java.util.Objects;

public class DBCorsi
{
 private ArrayList<CorsoDTO> listaCorsi= new ArrayList<CorsoDTO>();

    public DBCorsi()
    {
        //è vuoto perché non ha alcuna classe padre
    }

    public DBCorsi(ArrayList<CorsoDTO> listaCorsi)
    {
        //non c'è il "super()" perché non c'è alcuna classe padre
        this.listaCorsi = listaCorsi;
    }

    public ArrayList<CorsoDTO> getListaCorsi() {
        return listaCorsi;
    }

    @Override
    public String toString() {
        return "DBCorsi{"+
                "listaCorsi=" + listaCorsi +
                '}';
    }

    public void setListaCorsi(ArrayList<CorsoDTO> listaCorsi) {
        this.listaCorsi = listaCorsi;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DBCorsi dbCorsi = (DBCorsi) o;
        return Objects.equals(listaCorsi, dbCorsi.listaCorsi);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listaCorsi);
    }


    public void aggCorso (CorsoDTO corso)
    {
        this.listaCorsi.add(corso);
        System.out.println("Il corso \""+ corso.getNome() + "\" è stato aggiunto con successo");
    }

    public void cancCorso (CorsoDTO corso)
    {
        if (listaCorsi.remove(corso)) //non solo rimuove eventualmente il corso indicato, ma se l'operazione ha avuto successo (quindi se c'era un corso nella lista e lo ha eliminato) restituisce true, mentre se il corso già non c'era nella lista, restituisce false
        {
            System.out.println("Il corso \""+ corso.getNome()+ "\" è stato rimosso con successo");
        }
        else
        {
            System.out.println("Il corso \""+ corso.getNome() + "\" non è stato rimosso poiché già non presente nella lista dei corsi");
        }
    }

    public void stampaListaCorsi()
    {
        System.out.println("Ecco tutti i corsi presenti: ");
        for (CorsoDTO c: listaCorsi)
        {
            System.out.println(c.getNome()+ " (durata: "+ c.getDurOre()+ " ore)");
        }
    }
}
