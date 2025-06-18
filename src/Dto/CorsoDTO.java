package Dto;

public class CorsoDTO {
    private long id;
    private String nome;
    private String descrizione;
    private String docente;

    public CorsoDTO() {}

    public CorsoDTO(long id, String nome, String descrizione, String docente) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.docente = docente;
    }

    // Getter e Setter ID
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    // Getter e Setter Nome
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // Getter e Setter Descrizione
    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    // Getter e Setter Docente
    public String getDocente() { return docente; }
    public void setDocente(String docente) { this.docente = docente; }

}