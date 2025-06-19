package DB;

import Dto.UtenteDTO;
import Dto.UtenteDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestionUtente {
    private static List<UtenteDTO> utenti = new ArrayList<>();

    static {
        inizializzaUtenti();
    }

    private static void inizializzaUtenti() {
        utenti.add(new UtenteDTO("Abanoub", "Kedis"));
        utenti.add(new UtenteDTO("Michele", "Cirilo"));
        utenti.add(new UtenteDTO("Antonio", "Pattriotto"));

    }

    public static List<UtenteDTO> getTuttiIUtenti() {
        return new ArrayList<>(utenti);
    }

    public static int getIdUtenteFromNomeCognome(String nome, String cognome){
        return utenti.stream()
                .filter(c -> (c.getNome().equalsIgnoreCase(nome) && c.getCognome().equals(cognome)))
                .findFirst().get().getUtenteID();
    }
    /*
    public static UtenteDTO getUtenteIDFromName(String nome, String cognome) {
        Optional<UtenteDTO> trovato = utenti.stream()
                .filter(c -> (c.getNome().equalsIgnoreCase(nome) && c.getCognome().equals(cognome)))
                .findFirst();
        return trovato.orElse(null);
    }
    */

    public static UtenteDTO getUtente(int utenteID) {
        Optional<UtenteDTO> trovato = utenti.stream()
                .filter(c -> c.getUtenteID() == utenteID)
                .findFirst();
        return trovato.orElse(null);
    }

    public static boolean aggiungiUtente(UtenteDTO utente) {
        if (getUtente(utente.getUtenteID()) == null) {
            utenti.add(utente);
            return true;
        }
        return false;
    }

    public static boolean rimuoviCorso(int utenteID) {
        return utenti.removeIf(c -> c.getUtenteID() == utenteID);
    }
}
