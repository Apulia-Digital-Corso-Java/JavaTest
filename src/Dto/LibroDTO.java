package DTO;

import Dto.BaseDTO;

public class LibroDTO extends BaseDTO {
    private String titolo;
    private String autore;
    private String materia;

    // Costruttore vuoto
    public LibroDTO() {
        super();
    }

    // Costruttore completo
    public LibroDTO(Long id, String titolo, String autore, String materia) {
        super();
        this.titolo = titolo;
        this.autore = autore;
        this.materia = materia;
    }

    // Getter e Setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    // toString
    @Override
    public String toString() {
        return "LibroDTO{" +
                "id=" + getId() +
                ", titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}
