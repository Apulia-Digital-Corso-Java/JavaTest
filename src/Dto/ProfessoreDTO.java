package Dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class ProfessoreDTO extends UtenteDTO {
    private String codiceDocente;
    private String dipartimento;
    private LocalDate dataAssunzione;
    private String qualifica;
    private List<String> materieInsegnate;
    private List<Long> compitiSupervisionati;
    private List<Long> compitiValutati;

    public ProfessoreDTO() {
        super();
    }

    public ProfessoreDTO(String nome, String cognome, String codiceDocente, String dipartimento, String qualifica) {
        super(nome, cognome);
        this.codiceDocente = codiceDocente;
        this.dipartimento = dipartimento;
        this.qualifica = qualifica;
        this.dataAssunzione = LocalDate.now();
    }

    public String getCodiceDocente() { return codiceDocente; }
    public void setCodiceDocente(String codiceDocente) { this.codiceDocente = codiceDocente; }
    public String getDipartimento() { return dipartimento; }
    public void setDipartimento(String dipartimento) { this.dipartimento = dipartimento; }
    public LocalDate getDataAssunzione() { return dataAssunzione; }
    public void setDataAssunzione(LocalDate dataAssunzione) { this.dataAssunzione = dataAssunzione; }
    public String getQualifica() { return qualifica; }
    public void setQualifica(String qualifica) { this.qualifica = qualifica; }
    public List<String> getMaterieInsegnate() { return materieInsegnate; }
    public void setMaterieInsegnate(List<String> materieInsegnate) { this.materieInsegnate = materieInsegnate; }
    public List<Long> getCompitiSupervisionati() { return compitiSupervisionati; }
    public void setCompitiSupervisionati(List<Long> compitiSupervisionati) { this.compitiSupervisionati = compitiSupervisionati; }
    public List<Long> getCompitiValutati() { return compitiValutati; }
    public void setCompitiValutati(List<Long> compitiValutati) { this.compitiValutati = compitiValutati; }

    @Override
    public String toString() {
        return "Professore{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", codiceDocente='" + codiceDocente + '\'' +
                ", dipartimento='" + dipartimento + '\'' +
                ", qualifica='" + qualifica + '\'' +
                ", materieInsegnate=" + materieInsegnate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfessoreDTO)) return false;
        if (!super.equals(o)) return false;
        ProfessoreDTO prof = (ProfessoreDTO) o;
        return Objects.equals(codiceDocente, prof.codiceDocente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codiceDocente);
    }
}