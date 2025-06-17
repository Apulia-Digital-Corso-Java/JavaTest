package Dto;

public class CorsoDTO extends BaseDTO{
    private String nomeCorso;
    private String docente;

    //Costruttore Vuoto
    public CorsoDTO() {

    }

    //Costruttore Completo
public CorsoDTO(Long id, String nomeCorso, String docente) {
    super();
    this.nomeCorso = nomeCorso;
    this.docente = docente;
    }

    //Getter e Setter
    //nomecorso
    public String getNomeCorso(){
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }
    //docente
    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente)  {
        this.docente = docente;
    }

    //toString


    @Override
public String toString() {
        return "CorsoDTO{" +
        "id=" + getId() +
        ", nomeCorso='"+ nomeCorso + '\'' +
        ", docente='" + docente + '\'' +
        "}";

    }
}
