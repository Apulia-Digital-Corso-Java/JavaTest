import DB.GestioneCorso;
import Dto.AccountDTO;
import Dto.CorsoDTO;
import Dto.UtenteDTO;

public class Main {

	public static void main (String[] args)
	{
		UtenteDTO u1=new UtenteDTO("Mario", "Rossi");
		UtenteDTO u2=new UtenteDTO("Luigi", "Verdi");
		UtenteDTO u3=new UtenteDTO("Rosalinda", "Haltmann");
		AccountDTO a1=new AccountDTO("Nintendo","MammaMia","mario@gmail.com","0", u1);
		AccountDTO a2=new AccountDTO("Nintendo2","MammaMia2","luigi@gmail.com","1", u2);
		AccountDTO a3=new AccountDTO("Galaxy","Luma69","galaxy@gmail.com","2", u3);
		a1.login(u1);
		//vedi esame
		a1.logout(u1);
		a2.login(u2);
		//vedi esame
		a2.logout(u2);
		a3.login(u3);
		//vedi esame
		a3.logout(u3);




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
