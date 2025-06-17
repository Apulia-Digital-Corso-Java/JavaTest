public Dto;

public class LibroDTO {
    private long id;
    private String titolo;
    private Strin autore;
    private String descrizione;
    private int annoUscite;

    public LibroDTO () {}

    // Getter e Setter Titolo
    public long getId () {return id;}
    public void setId(long id) {this.id = id; }

    // Getter e Setter Autore
    public Strin getAutore() {return autore;}
    public void setAutore (String autore) {this.autore= autore;}

    // Getter e Setter Descrizione
    public String getDescrizione() {return descrizione;}
    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}

    // Getter e Setter annoUscita
    public int getAnnoUscita() {return AnnoUscita;}
    public void setAnnoUscita(int annoUscite) {this.getAnnoUscita = getAnnoUscita;}
}