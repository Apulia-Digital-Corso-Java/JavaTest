package Dto;

import java.util.Objects;

public class LibroDTO extends BaseDTO {
    private String titolo;
    private String autore;
    private String isbn;
    private String editore;
    private int annoEdizione;
    private double prezzo;
    private Long materiaId;
    private boolean obbligatorio;
    private String descrizione;

    public LibroDTO() { super(); }

    public LibroDTO(String titolo, String autore, String isbn) {
        super();
        this.titolo = titolo;
        this.autore = autore;
        this.isbn = isbn;
    }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }
    public String getAutore() { return autore; }
    public void setAutore(String autore) { this.autore = autore; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getEditore() { return editore; }
    public void setEditore(String editore) { this.editore = editore; }
    public int getAnnoEdizione() { return annoEdizione; }
    public void setAnnoEdizione(int annoEdizione) { this.annoEdizione = annoEdizione; }
    public double getPrezzo() { return prezzo; }
    public void setPrezzo(double prezzo) { this.prezzo = prezzo; }
    public Long getMateriaId() { return materiaId; }
    public void setMateriaId(Long materiaId) { this.materiaId = materiaId; }
    public boolean isObbligatorio() { return obbligatorio; }
    public void setObbligatorio(boolean obbligatorio) { this.obbligatorio = obbligatorio; }
    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + getId() +
                ", titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroDTO)) return false;
        if (!super.equals(o)) return false;
        LibroDTO libro = (LibroDTO) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isbn);
    }
}