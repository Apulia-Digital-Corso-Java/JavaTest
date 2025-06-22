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
		AccountDTO a1=new AccountDTO("Nintendo85","MammaMia","mariorossi@gmail.com","0", u1);
		System.out.println(a1.login(u1));
		System.out.println(a1.logout(u1));
		AccountDTO a2=new AccountDTO("Ghost01","MammaMia2","luigiverdi@gmail.com","1", u2);
		System.out.println(a2.login(u2));
		System.out.println(a2.logout(u2));
		AccountDTO a3=new AccountDTO("QueenUniverse","Luma69","rosalindagalaxy@gmail.com","2", u3);
		System.out.println(a3.login(u3));
		System.out.println(a3.logout(u3));

		//STAMPO TUTTI I CORSI DISPONIBILI NELLA SCUOLA
		System.out.println("Ecco tutti i corsi disponibili:");
		for (int i=0; i<GestioneCorsi.getTuttiICorsi().size(); i++)
		{
			System.out.println(i+1+")"+ GestioneCorsi.getTuttiICorsi().get(i).toString());
		}

		//ISCRIVO I 3 STUDENTI A VARI CORSI

		System.out.println(GestioneCorsi.iscrUtenteACorso(u1.getId(),"Programmazione Java"));
		System.out.println(GestioneCorsi.iscrUtenteACorso(u1.getId(),"Programmazione Java")); //ERRORE: utente già iscritto
		System.out.println(GestioneCorsi.iscrUtenteACorso(u2.getId(),"Programmazione Java"));
		System.out.println(GestioneCorsi.iscrUtenteACorso(u2.getId(),"HTML e CSS"));
		System.out.println(GestioneCorsi.iscrUtenteACorso(u2.getId(),"agghahjahjsjahs")); //ERRORE: corso inesistente
		System.out.println(GestioneCorsi.iscrUtenteACorso(u3.getId(),"Git e GitHub"));
		System.out.println(GestioneCorsi.iscrUtenteACorso(0,"Git e GitHub")); //ERRORE: utente inesistente

		//STAMPO TUTTI I CORSI A CUI È ISCRITTO L'UTENTE U1
		System.out.println("L'utente "+u1.getNome()+ " "+ u1.getCognome()+ " è iscritto ai seguenti corsi:");
		int i=0;
		for (CorsoDTO corso: GestioneCorsi.getTuttiICorsi())
		{
			for (UtenteDTO studente: corso.getListaIscritti())
			{
				if (studente.getId()== u1.getId())
				{
					System.out.println(i+1+")"+ corso.toString());
					i++;
					break;
				}
			}
		}
		//STAMPO TUTTI I CORSI A CUI È ISCRITTO L'UTENTE U2
		System.out.println("L'utente "+u2.getNome()+ " "+ u2.getCognome()+ " è iscritto ai seguenti corsi:");
		i=0;
		for (CorsoDTO corso: GestioneCorsi.getTuttiICorsi())
		{
			for (UtenteDTO studente: corso.getListaIscritti())
			{
				if (studente.getId()== u2.getId())
				{
					System.out.println(i+1+")"+ corso.toString());
					i++;
					break;
				}
			}
		}

		//STAMPO TUTTI I CORSI A CUI È ISCRITTO L'UTENTE U3
		System.out.println("L'utente "+u3.getNome()+ " "+ u3.getCognome()+ " è iscritto ai seguenti corsi:");
		i=0;
		for (CorsoDTO corso: GestioneCorsi.getTuttiICorsi())
		{
			for (UtenteDTO studente: corso.getListaIscritti())
			{
				if (studente.getId()== u3.getId())
				{
					System.out.println(i+1+")"+ corso.toString());
					i++;
					break;
				}
			}
		}

		//STAMPA TUTTI GLI UTENTI ISCRITTI AL CORSO "Programmazione Java"
		System.out.println("Ecco tutti gli iscritti al corso \"Programmazione Java\"");
		i=0;
		for (UtenteDTO studente: GestioneCorsi.trovaCorso("Programmazione Java").get().getListaIscritti())
		{
			System.out.println(i+1+")"+studente.getNome()+ " "+ studente.getCognome());
		}

		//RIMUOVO I 3 STUDENTI DAI VARI CORSI

		System.out.println(GestioneCorsi.cancUtenteDaCorso(u1.getId(),"Programmazione Java"));
		System.out.println(GestioneCorsi.cancUtenteDaCorso(u2.getId(),"Programmazione Java"));
		System.out.println(GestioneCorsi.cancUtenteDaCorso(u2.getId(),"HTML e CSS"));
		System.out.println(GestioneCorsi.cancUtenteDaCorso(u2.getId(),"agghahjahjsjahs")); //ERRORE: corso inesistente
		System.out.println(GestioneCorsi.cancUtenteDaCorso(u3.getId(),"Git e GitHub"));
		System.out.println(GestioneCorsi.cancUtenteDaCorso(0,"Git e GitHub")); //ERRORE: utente inesistente






	}
}
