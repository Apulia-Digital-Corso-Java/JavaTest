package DB;

import Dto.CorsoDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestioneCorsi
{
	private static List<CorsoDTO> listaCorsi = new ArrayList<>();

	static {
		inizializzaCorsi();
	}

	private static void inizializzaCorsi() {
		listaCorsi.add(new CorsoDTO("Programmazione Java", 40));
		listaCorsi.add(new CorsoDTO("Python Base", 35));
		listaCorsi.add(new CorsoDTO("HTML e CSS", 25));
		listaCorsi.add(new CorsoDTO("JavaScript Avanzato", 30));
		listaCorsi.add(new CorsoDTO("Database MySQL", 30));
		listaCorsi.add(new CorsoDTO("Git e GitHub", 20));
		listaCorsi.add(new CorsoDTO("Android Studio", 45));
		listaCorsi.add(new CorsoDTO("Spring Boot", 40));
		listaCorsi.add(new CorsoDTO("Cybersecurity", 25));
		listaCorsi.add(new CorsoDTO("Linux Base", 20));
		listaCorsi.add(new CorsoDTO("C++ Avanzato", 50));
		listaCorsi.add(new CorsoDTO("ReactJS", 35));
		listaCorsi.add(new CorsoDTO("Machine Learning", 60));
		listaCorsi.add(new CorsoDTO("Cloud AWS", 30));
		listaCorsi.add(new CorsoDTO("Docker e Kubernetes", 40));
	}

	public static List<CorsoDTO> getTuttiICorsi()
	{
		return new ArrayList<>(listaCorsi);
	}

	public static CorsoDTO getCorso(String nomeCorso)
	{
		Optional<CorsoDTO> trovato = listaCorsi.stream()
			.filter(c -> c.getNomeCorso().equalsIgnoreCase(nomeCorso))
			.findFirst();
		return trovato.orElse(null);
	}

	public static boolean aggiungiCorso(CorsoDTO corso) {
		if (getCorso(corso.getNomeCorso()) == null) {
			listaCorsi.add(corso);
			return true;
		}
		return false;
	}

	public static boolean rimuoviCorso(String nomeCorso) {
		return listaCorsi.removeIf(c -> c.getNomeCorso().equalsIgnoreCase(nomeCorso));
	}


}