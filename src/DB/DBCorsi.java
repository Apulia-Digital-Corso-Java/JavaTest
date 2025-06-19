package DB;

import Dto.CorsoDTO;

import java.util.ArrayList;
import java.util.Objects;

public class DBCorsi
{
 private  static ArrayList<CorsoDTO> listaCorsi= null; //inizializzerò la lista nel costruttore

    public DBCorsi()
    {
        //non c'è il "super()" perché non c'è alcuna classe padre
        listaCorsi= new ArrayList<CorsoDTO>();
    }

    /*public DBCorsi(ArrayList<CorsoDTO> listaCorsi) //NON VA AGGIUNTO POICHE' DALL'ESTERNO NON DEVO POTER SETTARE UNA LISTA (pensa se ti aggiungono una lista fatta male, con tipi diversi da CorsoDTO...)
    {

        this.listaCorsi = listaCorsi;
    }*/

    public ArrayList<CorsoDTO> getListaCorsi()
    {
        return listaCorsi;
    }

    /*@Override
    public String toString() //l'override di toString non è necessario (NON AGGIUNGERLO) in questo caso (meglio stampaListaCorsi)
    {
        return "DBCorsi{"+
                "listaCorsi=" + listaCorsi +
                '}';
    }*/

    /*public void setListaCorsi(ArrayList<CorsoDTO> listaCorsi) //anche questo setter NON va aggiunto, poiché non devo poterlo settare dall'esterno
    {
        this.listaCorsi = listaCorsi;
    }*/

    @Override
    public boolean equals(Object o) //intellij ti suggerisce metodi sbagliati... chatgpt antelitteram
    {
        if (this==o) return true; //se l'hashcode di questa istanza di BDCorsi è uguale a quello dell'oggetto o, i due oggetti sono uguali
        if (!(o instanceof DBCorsi)) return false; //se la classe di o è diversa da DBCorsi, o NON è uguale a questa istanza di DBCorsi
        DBCorsi dbCorsi= (DBCorsi) o; //fo il casting di o dal tipo "Oggetto generico" a "DBCorsi"
        return Objects.equals(listaCorsi, dbCorsi.listaCorsi); //sono abbastanza sicuro sia sbagliato, perché controlla solo gli hashcode... vedrò domani
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listaCorsi);
    }


    public String aggCorso (CorsoDTO corso)
    {
        this.listaCorsi.add(corso);
        return "Il corso \""+ corso.getNome() + "\" è stato aggiunto con successo";
    }

    public void cancCorso (CorsoDTO corso)
    {
        /*if (listaCorsi.remove(corso)) //non solo rimuove eventualmente il corso indicato, ma se l'operazione ha avuto successo (quindi se c'era un corso nella lista e lo ha eliminato) restituisce true, mentre se il corso già non c'era nella lista, restituisce false
        {
            System.out.println("Il corso \""+ corso.getNome()+ "\" è stato rimosso con successo");
        }
        else
        {
            System.out.println("Il corso \""+ corso.getNome() + "\" non è stato rimosso poiché già non presente nella lista dei corsi");
        }*/
    }


}
