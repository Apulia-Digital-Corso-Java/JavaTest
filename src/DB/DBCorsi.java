package DB;

import Dto.CorsoDTO;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class DBCorsi
{
 private  static ArrayList<CorsoDTO> listaCorsi= null; //inizializzerò la lista nel costruttore

    public DBCorsi()
    {
        //non c'è il "super()" perché non c'è alcuna classe padre
        listaCorsi= new ArrayList<CorsoDTO>();
    }

    /*public DBCorsi(ArrayList<CorsoDTO> listaCorsi) //Un costruttore del genere NON VA AGGIUNTO POICHE' DALL'ESTERNO NON DEVO POTER SETTARE UNA LISTA (pensa se ti aggiungono una lista fatta male, con tipi diversi da CorsoDTO...)
    {

        this.listaCorsi = listaCorsi;
    }*/

    public static CorsoDTO getCorso(String nomeCorso)
    {
        Optional<CorsoDTO> trovato = listaCorsi.stream() //lo stream scorre tra tutti gli elementi di listaCorsi (che verranno chiamati c)
                .filter(c -> c.getNome().equalsIgnoreCase(nomeCorso)) //alla var trovato però non viene aggiunto ogni elemento, ma solo quelli che rispettano alcuni requisiti indicati da ".filter" (in questo caso, vengono aggiunti solo gli elementi i cui nomi è uguale a quello del parametro nomeCorso
                .findFirst(); //".findFirst" in realtà viene aggiunto solo il primo elemento che soddisfa il .filters
        return trovato.orElse(null); //se l'optional trovato è null, allora restituisce l'other (cioè cioò che scrivi nelle parentesi). Se invece non è nullo, restituisce il valore
    }
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

    public static boolean aggCorso(CorsoDTO corso) {
        if (getCorso(corso.getNome()) == null) //se l'optional ritornato da getCorso() è null (cioè se il corso non è già presente in listaCorsi)...
        {
            listaCorsi.add(corso);
            return true;
        }
        return false;
    }

    public static boolean cancelCorso(String nomeCorso)
    {
        return listaCorsi.removeIf(c -> c.getNome().equalsIgnoreCase(nomeCorso));
        //il return sopra prende ogni elemento di listaCorsi (chiamato "c") ed elimina da listacorsi tutti gli elementi tali che il loro nome sia uguale al quello indicato dal parametro nomeCorso (quel ".equalsIgnoreCase" fa sì che restituisca true (e che quindi cancelli l'elemento) anche se per esempio il nome nella lista è tutto maiuscolo mentre nomeCorso è tutto in minuscolo... in sostanza il confronto di .equals è case insensitive
    }


}
