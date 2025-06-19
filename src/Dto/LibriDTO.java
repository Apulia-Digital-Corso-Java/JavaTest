package Dto;

import java.util.ArrayList;
import java.util.List;


public class LibriDTO {

    private String titolo;
    private boolean prestabile;

    public LibriDTO(String titolo, boolean prestabile)
    {
        this.titolo = titolo;
        this.prestabile = prestabile;
    }

    public String getTitolo() {
        return titolo;
    }

    public Boolean prestabile() {
        return prestabile;
    }

    public static List<LibriDTO>
creaElencoLibri() {
        List<LibriDTO> elencoLibri = new ArrayList<>();

        elencoLibri.add(new LibriDTO("Il signore degli anlli 3 - Disponibile al prestito",true));

        elencoLibri.add(new LibriDTO("Harry Potter 1 - Prestato fino al 25/10/2025",false));

        elencoLibri.add(new LibriDTO("Il piccolo principe - Disponibile al prestito",true));

        elencoLibri.add(new LibriDTO("National Geographic- Disponibile al prestito ",true));

        return elencoLibri;
    }
    }