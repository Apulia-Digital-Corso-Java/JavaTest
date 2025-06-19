import DB.GestioneCorso;
import DB.GestioneUtenti;
import Dto.AccountDTO;
import Dto.CorsoDTO;
import Dto.EsameDTO;
import Dto.UtenteDTO;

import java.util.List;

public class Main {

	public static void main (String[] args){

		// 1. CREAZIONE UTENTI
		System.out.println("📌 UTENTI:");
		UtenteDTO u1 = GestioneUtenti.creaUtente("Luca", "Rossi");
		UtenteDTO u2 = GestioneUtenti.creaUtente("Maria", "Bianchi");

		System.out.println(u1);
		System.out.println(u2);

		// 2. CREAZIONE ACCOUNT (LOGIN/LOGOUT)
		System.out.println("\n🔐 LOGIN / LOGOUT:");
		AccountDTO account1 = new AccountDTO("lucarossi", "1234", "luca@mail.com", "1234567890", u1);
		System.out.println(account1.login(u1));
		System.out.println(account1.logout(u1));

		// 3. MOSTRA TUTTI I CORSI DISPONIBILI
		System.out.println("\n📚 TUTTI I CORSI:");
		for (CorsoDTO corso : GestioneCorso.getTuttiICorsi()) {
			System.out.println("- " + corso);
		}

		// 4. ISCRIZIONE DI UTENTI A CORSI
		GestioneCorso.iscriviUtenteACorso("JavaScript Avanzato", u1);
		GestioneCorso.iscriviUtenteACorso("JavaScript Avanzato", u2);
		GestioneCorso.iscriviUtenteACorso("Spring Boot", u1);
		GestioneCorso.iscriviUtenteACorso("Spring Boot", u2);
		GestioneCorso.iscriviUtenteACorso("Cybersecurity", u2);

		// 5. STAMPA CORSI DI UN UTENTE
		System.out.println("\n🎓 CORSI DI " + u1.getNome() + " " + u1.getCognome() + ":");
		List<CorsoDTO> corsiU1 = GestioneCorso.getCorsiPerUtente(u1);
		for (CorsoDTO corso : corsiU1) {
			System.out.println("- " + corso.getNomeCorso());
		}

		// 6. STAMPA UTENTI ISCRITTI A UN CORSO
		System.out.println("\n👥 UTENTI ISCRITTI A 'Spring Boot':");
		List<UtenteDTO> utentiSpring = GestioneCorso.getUtentiIscrittiAlCorso("Spring Boot");
		for (UtenteDTO utente : utentiSpring) {
			System.out.println("- " + utente.getNome() + " " + utente.getCognome());
		}

		// 7. RIMOZIONE UTENTE DA UN CORSO
		GestioneCorso.rimuoviUtenteDaCorso("Cybersecurity", u2);
		System.out.println("\n🚫 Dopo rimozione da 'Cybersecurity':");
		List<UtenteDTO> utentiCyber = GestioneCorso.getUtentiIscrittiAlCorso("Cybersecurity");
		if (utentiCyber.isEmpty()) {
			System.out.println("Nessun utente iscritto.");
		}

		// 8. REGISTRAZIONE ESAMI
		System.out.println("\n📝 REGISTRAZIONE ESAMI:");
		EsameDTO esame1 = new EsameDTO(u1, GestioneCorso.getCorso("Spring Boot"), "2024-06-10", 28);
		EsameDTO esame2 = new EsameDTO(u2, GestioneCorso.getCorso("JavaScript Avanzato"), "2024-06-12", 17);
		EsameDTO esame3 = new EsameDTO(u2, GestioneCorso.getCorso("Spring Boot"), "2024-06-13", 30);

		System.out.println(esame1);
		System.out.println(esame2);
		System.out.println(esame3);

		// 9. FILTRAGGIO: ESAMI SUPERATI
		System.out.println("\n✅ ESAMI SUPERATI:");
		List<EsameDTO> esami = List.of(esame1, esame2, esame3);
		for (EsameDTO esame : esami) {
			if (esame.isSuperato()) {
				System.out.println("- " + esame.getUtente().getNome() + " ha superato " +
					esame.getCorso().getNomeCorso() + " con " + esame.getVoto());
			}
		}

		// 10. MODIFICA DI UN VOTO (esame2 da 17 a 23)
		System.out.println("\n✏️ MODIFICA VOTO:");
		System.out.println("Prima: " + esame2);
		esame2.setVoto(23);  // Superato ora!
		System.out.println("Dopo:  " + esame2);

		// 11. STAMPA DI TUTTI GLI UTENTI
		System.out.println("\n📋 UTENTI REGISTRATI:");
		for (UtenteDTO utente : GestioneUtenti.getTuttiGliUtenti()) {
			System.out.println("- " + utente);
		}


	}
}
