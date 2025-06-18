package DB;

import Dto.CorsoDTO;
import java.util.ArrayList;

public class GestioneCorso {
    private ArrayList<Dto.CorsoDTO> corsi;

    public GestioneCorso() {
        corsi = new ArrayList<>();
        corsi.add(new CorsoDTO("Programmazione Java", "120 ore"));
        corsi.add(new CorsoDTO("Programmazione Angular" , "40 ore"));
        corsi.add(new CorsoDTO("Microsoft Office" , "10 ore"));
        corsi.add(new CorsoDTO("Base di dati" , "30 ore"));
    }

    public void StampaCorsi() {
        for (CorsoDTO corso : corsi) {
            System.out.println(corso);
        }
    }
}
