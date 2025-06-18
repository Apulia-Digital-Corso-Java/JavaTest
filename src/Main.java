import Dto.Account;
import Dto.UtenteDTO;
import DB.GestioneCorso;

import java.util.Objects;

public class Main {

	public static void main (String[] args){

		UtenteDTO u1 = new UtenteDTO("Pasquale", "S");
		UtenteDTO u2 = new UtenteDTO("Francesco", "S");
		UtenteDTO u3 = new UtenteDTO("Tizio", "S");

		Account a = new Account("paky","pass","paky@email.it","0881123456",u1);
		Account a2 = new Account("Francesco","pass","Francesco@email.it","0881321654",u2);


		System.out.println();
		System.out.println(a.login(u1));
		System.out.println();
		System.out.println(a2.login(u2));
		System.out.println();
		System.out.println(a.logout(u1));
		System.out.println();
		System.out.println(a2.logout(u2));

		GestioneCorso gestione = new GestioneCorso();
		gestione.StampaCorsi();

	}
}
