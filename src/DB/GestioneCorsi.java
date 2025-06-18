package DB;

import Dto.CorsoDTO;
import java.util.ArrayList;

public class GestioneCorsi {
        // Lista privata con 5 corsi predefiniti
        private static ArrayList<CorsoDTO> corsi = new ArrayList<>();

        static {
            corsi.add(new CorsoDTO("Matematica", 40));
            corsi.add(new CorsoDTO("Fisica", 35));
            corsi.add(new CorsoDTO("Informatica", 50));
            corsi.add(new CorsoDTO("Storia", 30));
            corsi.add(new CorsoDTO("Chimica", 45));
        }

        // Metodo per stampare i corsi
        public static void stampaCorsi() {
            for (CorsoDTO corso : corsi) {
                System.out.println(corso);
            }
        }

        // (Opzionale) Getter se vuoi usare i dati anche fuori
        public static ArrayList<CorsoDTO> getCorsi() {
            return corsi;
        }

    public static void aggiungiCorso(String nome, int durata) {
        corsi.add(new CorsoDTO(nome, durata));
    }

    public static void rimuoviCorso(String nome) {
        corsi.removeIf(corso -> corso.getNome().equalsIgnoreCase(nome));
    }

}


