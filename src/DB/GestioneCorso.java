package DB;

import Dto.CorsoDTO;
import Dto.UtenteDTO;
import java.util.ArrayList;
import java.util.List;

public class GestioneCorso {
	private static List<CorsoDTO> corsi = new ArrayList<>();

	static {
		inizializzaCorsi();
	}

	private static void inizializzaCorsi() {
		corsi.add(new CorsoDTO("Programmazione Java", 40));
		corsi.add(new CorsoDTO("Python Base", 35));
		corsi.add(new CorsoDTO("HTML e CSS", 25));
		corsi.add(new CorsoDTO("JavaScript Avanzato", 30));
		corsi.add(new CorsoDTO("Database MySQL", 30));
		corsi.add(new CorsoDTO("Git e GitHub", 20));
		corsi.add(new CorsoDTO("Android Studio", 45));
		corsi.add(new CorsoDTO("Spring Boot", 40));
		corsi.add(new CorsoDTO("Cybersecurity", 25));
		corsi.add(new CorsoDTO("Linux Base", 20));
		corsi.add(new CorsoDTO("C++ Avanzato", 50));
		corsi.add(new CorsoDTO("ReactJS", 35));
		corsi.add(new CorsoDTO("Machine Learning", 60));
		corsi.add(new CorsoDTO("Cloud AWS", 30));
		corsi.add(new CorsoDTO("Docker e Kubernetes", 40));

		// Esempio: iscrivere i primi 3 utenti al corso "Programmazione Java"
		CorsoDTO corsoJava = getCorso("Programmazione Java");
		List<UtenteDTO> utenti = GestioneUtenti.getTuttiGliUtenti();
		if (corsoJava != null && utenti.size() >= 3) {
			corsoJava.iscriviUtente(utenti.get(0));
			corsoJava.iscriviUtente(utenti.get(1));
			corsoJava.iscriviUtente(utenti.get(2));
		}
	}

	// CRUD per corsi
	public static List<CorsoDTO> getTuttiICorsi() {
		return new ArrayList<>(corsi);
	}

	public static CorsoDTO getCorso(String nomeCorso) {
		return corsi.stream()
			.filter(c -> c.getNomeCorso().equalsIgnoreCase(nomeCorso))
			.findFirst()
			.orElse(null);
	}

	public static boolean aggiungiCorso(CorsoDTO corso) {
		if (getCorso(corso.getNomeCorso()) == null) {
			corsi.add(corso);
			return true;
		}
		return false;
	}

	public static boolean rimuoviCorso(String nomeCorso) {
		return corsi.removeIf(c -> c.getNomeCorso().equalsIgnoreCase(nomeCorso));
	}

	// GESTIONE UTENTI NEI CORSI

	public static boolean iscriviUtenteACorso(String nomeCorso, UtenteDTO utente) {
		CorsoDTO corso = getCorso(nomeCorso);
		if (corso != null && utente != null) {
			corso.iscriviUtente(utente);
			return true;
		}
		return false;
	}

	public static boolean rimuoviUtenteDaCorso(String nomeCorso, UtenteDTO utente) {
		CorsoDTO corso = getCorso(nomeCorso);
		if (corso != null && utente != null) {
			corso.rimuoviUtente(utente);
			return true;
		}
		return false;
	}

	public static List<UtenteDTO> getUtentiIscrittiAlCorso(String nomeCorso) {
		CorsoDTO corso = getCorso(nomeCorso);
		if (corso != null) {
			return corso.getUtentiIscritti();
		}
		return new ArrayList<>();
	}

	public static List<CorsoDTO> getCorsiPerUtente(UtenteDTO utente) {
		List<CorsoDTO> corsiUtente = new ArrayList<>();
		for (CorsoDTO corso : corsi) {
			if (corso.getUtentiIscritti().contains(utente)) {
				corsiUtente.add(corso);
			}
		}
		return corsiUtente;
	}

}
