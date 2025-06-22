package DB;

import Dto.CorsoDTO;
import Dto.UtenteDTO;

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

	public static Optional<CorsoDTO> trovaCorso(String nomeCorso)
	{
		return listaCorsi.stream()
			.filter(c -> c.getNomeCorso().equalsIgnoreCase(nomeCorso))
			.findFirst();
	}

	public static boolean aggiungiCorso(CorsoDTO corso) {
		if (trovaCorso(corso.getNomeCorso()).isEmpty()) {
			listaCorsi.add(corso);
			return true;
		}
		return false;
	}

	public static boolean rimuoviCorso(String nomeCorso) {
		return listaCorsi.removeIf(c -> c.getNomeCorso().equalsIgnoreCase(nomeCorso));
	}

	public static String iscrUtenteACorso(int idStud, String nomeCorso)
	{
		Optional<CorsoDTO> corso= trovaCorso(nomeCorso);
		if (corso.isEmpty())
		{
			return "Il corso a cui stai cercando di iscrivere l'utente non esiste. Ritentare";
		}
		else
		{
			Optional<UtenteDTO> studente= GestioneUtenti.trovaUtente(idStud);
			if (studente.isEmpty())
			{
				return "L'utente che stai cercando di iscrivere al corso non esiste. Ritentare";
			}
			else
			{
				if (corso.get().trovaIscritto(idStud).isPresent())
				{
					return "L'utente è già iscritto a questo corso";
				}
				else
				{
					corso.get().getListaIscritti().add(studente.get());
					return "L'utente è stato iscritto al corso correttamente";
				}

			}

		}

	}
	public static String cancUtenteDaCorso(int idStud, String nomeCorso)
	{
		Optional<CorsoDTO> corso= trovaCorso(nomeCorso);
		if (corso.isEmpty())
		{
			return "Il corso da cui stai cercando di rimuovere l'utente non esiste. Ritentare";
		}
		else
		{
			Optional<UtenteDTO> studente= GestioneUtenti.trovaUtente(idStud);
			if (studente.isEmpty())
			{
				return "L'utente che stai cercando di rimuovere dal corso non esiste. Ritentare";
			}
			else
			{
				corso.get().getListaIscritti().remove(studente.get());
				return "L'utente è stato disiscritto dal corso correttamente";

			}

		}

	}


}