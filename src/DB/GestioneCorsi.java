package DB;

import Dto.CorsoDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestioneCorsi
{
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
	}

	public static List<CorsoDTO> getTuttiICorsi()
	{
		return new ArrayList<>(corsi);
	}

	public static CorsoDTO getCorso(String nomeCorso)
	{
		Optional<CorsoDTO> trovato = corsi.stream()
			.filter(c -> c.getNomeCorso().equalsIgnoreCase(nomeCorso))
			.findFirst();
		return trovato.orElse(null);
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
}