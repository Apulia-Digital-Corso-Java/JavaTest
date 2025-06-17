package Dto;

public class LibroDTO {
    private long id;
    private String titolo;
    private String autore;
    private String descrizione;
    private int annoUscita;

    public LibroDTO() {}

    public LibroDTO(long id, String titolo, String autore, String descrizione, int annoUscita) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.descrizione = descrizione;
        this.annoUscita = annoUscita;
    }

    // Getter e Setter Titolo
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    // Getter e Setter Autore
    public String getAutore() { return autore; }
    public void setAutore(String autore) { this.autore = autore; }

    // Getter e Setter Descrizione
    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    // Getter e Setter annoUscita
    public int getAnnoUscita() { return annoUscita; }
    public void setAnnoUscita(int annoUscita) { this.annoUscita = annoUscita; }

}