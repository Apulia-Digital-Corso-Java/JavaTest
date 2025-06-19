import Dto.AppuntiDTO;
import Dto.LibriDTO;
import Dto.UtenteDTO;

import java.util.Objects;
import java.util.List;
import java.util.Scanner;





public class Main {

    private static List<AppuntiDTO> libreria;
    private static Scanner scanner;

    public static void main (String[] args){


			AppuntiDTO appunto = new AppuntiDTO( ".pdf");



			System.out.println("Nome file PDF: " + appunto.getNomeFilePDF());






		List<LibriDTO> libri = LibriDTO.creaElencoLibri();
		System.out.println("-----------------");

		System.out.println("Elenco dei libri e disponibilità:");

		System.out.println("-----------------");

		for (LibriDTO libro : libri) {
			String disponibilità = libro.prestabile()?
					"disponibile" : "non disponibile" ;

			System.out.println("Titolo: " + libro.getTitolo()  );

		}
	}
		}





