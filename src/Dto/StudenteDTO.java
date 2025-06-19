package Dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class StudenteDTO extends UtenteDTO {
    private String matricola;
    private LocalDate dataIscrizione;
    private String classe;
    private String sezione;
    private String annoScolastico;
    private List<Long> compitiSvolti;

    public StudenteDTO() {
        super();
    }

    public StudenteDTO(String nome, String cognome, String matricola, String classe, String sezione) {
        super(nome, cognome);
        this.matricola = matricola;
        this.classe = classe;
        this.sezione = sezione;
        this.dataIscrizione = LocalDate.now();
        this.annoScolastico = LocalDate.now().getYear() + "/" + (LocalDate.now().getYear() + 1);
    }

    public String getMatricola() { return matricola; }
    public void setMatricola(String matricola) { this.matricola = matricola; }
    public LocalDate getDataIscrizione() { return dataIscrizione; }
    public void setDataIscrizione(LocalDate dataIscrizione) { this.dataIscrizione = dataIscrizione; }
    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }
    public String getSezione() { return sezione; }
    public void setSezione(String sezione) { this.sezione = sezione; }
    public String getAnnoScolastico() { return annoScolastico; }
    public void setAnnoScolastico(String annoScolastico) { this.annoScolastico = annoScolastico; }
    public List<Long> getCompitiSvolti() { return compitiSvolti; }
    public void setCompitiSvolti(List<Long> compitiSvolti) { this.compitiSvolti = compitiSvolti; }

    @Override
    public String toString() {
        return "Studente{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", matricola='" + matricola + '\'' +
                ", classe='" + classe + '\'' +
                ", sezione='" + sezione + '\'' +
                ", annoScolastico='" + annoScolastico + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudenteDTO)) return false;
        if (!super.equals(o)) return false;
        StudenteDTO studente = (StudenteDTO) o;
        return Objects.equals(matricola, studente.matricola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricola);
    }
}