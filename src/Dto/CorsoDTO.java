package Dto;

<<<<<<< HEAD
public class CorsoDTO {
	private String nomeCorso;
	private int durata;

	public CorsoDTO(String nomeCorso, int durata) {
		this.nomeCorso = nomeCorso;
		this.durata = durata;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public int getDurata() {
		return durata;
	}

	@Override
	public String toString() {
		return nomeCorso + " (" + durata + " ore)";
	}
}
=======
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class CorsoDTO extends BaseDTO {
    private String nomeCorso;
    private String codiceCorso;
    private Long materiaId;
    private Long professoreId;
    private String annoScolastico;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private List<Long> studentiIscritti;
    private String aula;
    private int maxStudenti;
    // Attributi aggiuntivi per gestione compiti
    private LocalDate dataCompito;
    private String classe;
    private String sezione;
    private List<Long> studentiCompito;
    private Long professoreSupervisoreId;
    private Long professoreValutatoreId;

    public CorsoDTO() {
        super();
    }

    public CorsoDTO(String nomeCorso, String codiceCorso, Long materiaId, Long professoreId, String aula) {
        super();
        this.nomeCorso = nomeCorso;
        this.codiceCorso = codiceCorso;
        this.materiaId = materiaId;
        this.professoreId = professoreId;
        this.aula = aula;
        this.annoScolastico = LocalDate.now().getYear() + "/" + (LocalDate.now().getYear() + 1);
        this.maxStudenti = 30;
    }

    // Getter e Setter
    public String getNomeCorso() { return nomeCorso; }
    public void setNomeCorso(String nomeCorso) { this.nomeCorso = nomeCorso; }
    public String getCodiceCorso() { return codiceCorso; }
    public void setCodiceCorso(String codiceCorso) { this.codiceCorso = codiceCorso; }
    public Long getMateriaId() { return materiaId; }
    public void setMateriaId(Long materiaId) { this.materiaId = materiaId; }
    public Long getProfessoreId() { return professoreId; }
    public void setProfessoreId(Long professoreId) { this.professoreId = professoreId; }
    public String getAnnoScolastico() { return annoScolastico; }
    public void setAnnoScolastico(String annoScolastico) { this.annoScolastico = annoScolastico; }
    public LocalDate getDataInizio() { return dataInizio; }
    public void setDataInizio(LocalDate dataInizio) { this.dataInizio = dataInizio; }
    public LocalDate getDataFine() { return dataFine; }
    public void setDataFine(LocalDate dataFine) { this.dataFine = dataFine; }
    public List<Long> getStudentiIscritti() { return studentiIscritti; }
    public void setStudentiIscritti(List<Long> studentiIscritti) { this.studentiIscritti = studentiIscritti; }
    public String getAula() { return aula; }
    public void setAula(String aula) { this.aula = aula; }
    public int getMaxStudenti() { return maxStudenti; }
    public void setMaxStudenti(int maxStudenti) { this.maxStudenti = maxStudenti; }
    public LocalDate getDataCompito() { return dataCompito; }
    public void setDataCompito(LocalDate dataCompito) { this.dataCompito = dataCompito; }
    public String getClasse() { return classe; }
    public void setClasse(String classe) { this.classe = classe; }
    public String getSezione() { return sezione; }
    public void setSezione(String sezione) { this.sezione = sezione; }
    public List<Long> getStudentiCompito() { return studentiCompito; }
    public void setStudentiCompito(List<Long> studentiCompito) { this.studentiCompito = studentiCompito; }
    public Long getProfessoreSupervisoreId() { return professoreSupervisoreId; }
    public void setProfessoreSupervisoreId(Long professoreSupervisoreId) { this.professoreSupervisoreId = professoreSupervisoreId; }
    public Long getProfessoreValutatoreId() { return professoreValutatoreId; }
    public void setProfessoreValutatoreId(Long professoreValutatoreId) { this.professoreValutatoreId = professoreValutatoreId; }

    @Override
    public String toString() {
        return "Corso{" +
                "id=" + getId() +
                ", nomeCorso='" + nomeCorso + '\'' +
                ", codiceCorso='" + codiceCorso + '\'' +
                ", materiaId=" + materiaId +
                ", professoreId=" + professoreId +
                ", annoScolastico='" + annoScolastico + '\'' +
                ", aula='" + aula + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CorsoDTO)) return false;
        if (!super.equals(o)) return false;
        CorsoDTO corso = (CorsoDTO) o;
        return Objects.equals(codiceCorso, corso.codiceCorso) &&
                Objects.equals(annoScolastico, corso.annoScolastico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codiceCorso, annoScolastico);
    }
}
>>>>>>> db9de97 (Create classi necessarie per la registrazione di tutti i dati utili)
