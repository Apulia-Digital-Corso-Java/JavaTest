import DB.GestioneCorsi;
import DB.GestioneUtenti;
import Dto.AccountDTO;
import Dto.CorsoDTO;
import Dto.UtenteDTO;

public class Main {

	public static void main (String[] args)
	{
		//CREO 3 NUOVI UTENTI
		UtenteDTO u1= GestioneUtenti.aggNuovoUtente("Mario", "Rossi");
		System.out.println("L'utente "+ u1.getNome()+" "+ u1.getCognome()+" è stato creato correttamente");
		UtenteDTO u2= GestioneUtenti.aggNuovoUtente("Luigi", "Verdi");
		System.out.println("L'utente "+ u2.getNome()+" "+ u2.getCognome()+" è stato creato correttamente");
		UtenteDTO u3=GestioneUtenti.aggNuovoUtente("Rosalinda", "Galaxy");
		System.out.println("L'utente "+ u3.getNome()+" "+ u3.getCognome()+" è stato creato correttamente");

		//CREO I 3 ACCOUNT DEI 3 UTENTI
		AccountDTO a1=new AccountDTO("Nintendo","MammaMia","mario@gmail.com","0", u1);
		System.out.println("L'account per l'utente "+ u1.getNome()+" "+ u1.getCognome()+" è stato creato correttamente");
		AccountDTO a2=new AccountDTO("Nintendo2","MammaMia2","luigi@gmail.com","1", u2);
		System.out.println("L'account per l'utente "+ u2.getNome()+" "+ u2.getCognome()+" è stato creato correttamente");
		AccountDTO a3=new AccountDTO("Galaxy","Luma69","galaxy@gmail.com","2", u3);
		System.out.println("L'account per l'utente "+ u3.getNome()+" "+ u3.getCognome()+" è stato creato correttamente");


		System.out.println(a1.login(u1));
		System.out.println("\nAggiungo un nuovo corso:");
		boolean aggiunto = GestioneCorsi.aggiungiCorso(new CorsoDTO("Informatica Generale", 15));
		System.out.println(aggiunto ? "Corso aggiunto!" : "Corso già presente.");
		System.out.println(a1.logout(u1));
		System.out.println(a2.login(u2));
		//vedi esame
		System.out.println(a2.logout(u2));
		System.out.println(a3.login(u3));
		//vedi esame
		System.out.println(a3.logout(u3));
		System.out.println(u1.getId());




		/*System.out.println("Tutti i corsi:");
		GestioneCorso.getTuttiICorsi().forEach(System.out::println);


		System.out.println("\nAggiungo un nuovo corso:");
		boolean aggiunto = GestioneCorso.aggiungiCorso(new CorsoDTO("Informatica Generale", 15));
		System.out.println(aggiunto ? "Corso aggiunto!" : "Corso già presente.");

		System.out.println("\nElimino un corso:");
		boolean rimosso = GestioneCorso.rimuoviCorso("Git e GitHub");
		System.out.println(rimosso ? "Corso rimosso." : "Corso non trovato.");

		System.out.println("\nLista aggiornata:");
		GestioneCorso.getTuttiICorsi().forEach(System.out::println);
*/

	}
}
