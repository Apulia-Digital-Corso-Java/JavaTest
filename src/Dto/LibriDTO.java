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

        elencoLibri.add(new LibriDTO("Il signore degli anlli",true));

        elencoLibri.add(new LibriDTO("Harry Potter",true));

        elencoLibri.add(new LibriDTO("Il piccolo principe",true));

        elencoLibri.add(new LibriDTO("National Geographic",true));

        return elencoLibri;
    }
    }