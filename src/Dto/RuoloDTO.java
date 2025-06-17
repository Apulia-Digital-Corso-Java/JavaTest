package Dto;

public class RuoloDTO extends BaseDTO {
    private String ruolo;

    //costanti ruoli
    public static final String STUDENTE = "Studente";
    public static final String PROFESSORE = "Professore";
    public static final String TUTOR = "Tutor";
    public static final String ADMIN = "Admin";

    //Costruttore vuoto
    public RuoloDTO () {
    }
    //Costruttore con ID e Ruolo
    public RuoloDTO (Long id, String ruolo) {
       super();
       this.ruolo = ruolo;
    }

    //Getter e Setter

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo){
        this.ruolo = ruolo;
    }

    // toString
    @Override
    public String toString() {
        return "RuoloDTO{" +
                "id=" + getId() +
                ", ruolo='" + ruolo + '\'' +
                '}';
    }
}

