package DB;

import Dto.UtenteDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestioneUtenti {
	private static List<UtenteDTO> utenti = new ArrayList<>();

	// Inizializzazione con 10 utenti di esempio
	static {
		creaUtente("Mario", "Rossi");
		creaUtente("Luca", "Bianchi");
		creaUtente("Giulia", "Verdi");
		creaUtente("Anna", "Neri");
		creaUtente("Marco", "Bruni");
		creaUtente("Laura", "Gialli");
		creaUtente("Paolo", "Grigi");
		creaUtente("Sara", "Azzurri");
		creaUtente("Davide", "Viola");
		creaUtente("Elena", "Marroni");
	}

	// CREATE
	public static UtenteDTO creaUtente(String nome, String cognome) {
		UtenteDTO nuovoUtente = new UtenteDTO(nome, cognome);
		utenti.add(nuovoUtente);
		return nuovoUtente;
	}

	// READ
	public static List<UtenteDTO> getTuttiGliUtenti() {
		return new ArrayList<>(utenti);
	}

	public static Optional<UtenteDTO> getUtenteById(long id) {
		return utenti.stream().filter(u -> u.getId() == id).findFirst();
	}

	// UPDATE
	public static boolean aggiornaUtente(long id, String nuovoNome, String nuovoCognome) {
		Optional<UtenteDTO> utenteOpt = getUtenteById(id);
		if (utenteOpt.isPresent()) {
			UtenteDTO utente = utenteOpt.get();
			utente.setNome(nuovoNome);
			utente.setCognome(nuovoCognome);
			return true;
		}
		return false;
	}

	// DELETE
	public static boolean rimuoviUtente(long id) {
		return utenti.removeIf(u -> u.getId() == id);
	}
}

