package Dto;

import java.util.Objects;

public class LibroDTO extends BaseDTO
{
    private String titolo;
    private String autore;
    private String editore;
    private String dataPubbl;

    public LibroDTO()
    {
        super();
    }

    public LibroDTO(String titolo, String autore, String editore, String dataPubbl) {
        this.titolo = titolo;
        this.autore = autore;
        this.editore = editore;
        this.dataPubbl = dataPubbl;
    }

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

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public String getDataPubbl() {
        return dataPubbl;
    }

    public void setDataPubbl(String dataPubbl) {
        this.dataPubbl = dataPubbl;
    }

    @Override
    public String toString() {
        return "LibroDTO{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", editore='" + editore + '\'' +
                ", dataPubbl='" + dataPubbl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LibroDTO libroDTO = (LibroDTO) o;
        return Objects.equals(titolo, libroDTO.titolo) && Objects.equals(autore, libroDTO.autore) && Objects.equals(editore, libroDTO.editore) && Objects.equals(dataPubbl, libroDTO.dataPubbl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), titolo, autore, editore, dataPubbl);
    }
}
