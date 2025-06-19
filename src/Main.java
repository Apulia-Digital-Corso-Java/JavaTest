import DB.GestioneCorso;
import Dto.AccountDTO;
import Dto.CorsoDTO;
import Dto.UtenteDTO;

public class Main {

	public static void main (String[] args){

		System.out.println("Tutti i corsi:");
		GestioneCorso.getTuttiICorsi().forEach(System.out::println);


		System.out.println("\nAggiungo un nuovo corso:");
		boolean aggiunto = GestioneCorso.aggiungiCorso(new CorsoDTO("Informatica Generale", 15));
		System.out.println(aggiunto ? "Corso aggiunto!" : "Corso già presente.");

		System.out.println("\nElimino un corso:");
		boolean rimosso = GestioneCorso.rimuoviCorso("Git e GitHub");
		System.out.println(rimosso ? "Corso rimosso." : "Corso non trovato.");

		System.out.println("\nLista aggiornata:");
		GestioneCorso.getTuttiICorsi().forEach(System.out::println);


	}
}
