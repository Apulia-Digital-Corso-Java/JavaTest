package Dto;

public class CorsoDTO {
    private long id;
    private String nome;
    private String descrizione;
    privatr String docente;

    public CorsoDTO(){}

    public CorsoDTO(long id, String nome, Strin descrizione, String docente){
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.docente = docente;
    }

    // Getter e Setter ID
    public long getId() {return id;}
    public void  setId(long id) { this.id = id }

    // Getter e Setter Nome
    public String getNome() {return nome; }
    public void setNome(String nome) {this.nome = nome;}

    // Getter e Setter Descrizione
    public String getDescrizione() {return descrizione;}
    public void setString(privatr string) {String = string;  }

    // Getter e Setter Docente
    public String getDocente(){return docente;}
    public void setDocente(String docente) {this.getDocente() = docente;}


}