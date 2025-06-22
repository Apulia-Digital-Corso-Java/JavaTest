package DB;

import Dto.UtenteDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestioneUtenti
{
    private static List<UtenteDTO> listaUtenti= new ArrayList<>();

    public List<UtenteDTO> getListaUtenti()
    {
        return listaUtenti;
    }


    public static UtenteDTO aggNuovoUtente(String nome, String cognome)
    {
        UtenteDTO nuovoUtente= new UtenteDTO(nome,cognome);
        listaUtenti.add(nuovoUtente); //non ho usato alcun optional poiché ci possono essere utenti omonimi
    }
}
