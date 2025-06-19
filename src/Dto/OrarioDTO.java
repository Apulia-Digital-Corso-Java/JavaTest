package Dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class OrarioDTO extends BaseDTO {
    private Long studenteId;
    private LocalDate data;
    private LocalTime oraIngresso;
    private LocalTime oraUscita;
    private boolean assente;

    public OrarioDTO() { super(); }

    public OrarioDTO(Long studenteId, LocalDate data, LocalTime oraIngresso, LocalTime oraUscita) {
        super();
        this.studenteId = studenteId;
        this.data = data;
        this.oraIngresso = oraIngresso;
        this.oraUscita = oraUscita;
        this.assente = false;
    }

    public Long getStudenteId() { return studenteId; }
    public void setStudenteId(Long studenteId) { this.studenteId = studenteId; }
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
    public LocalTime getOraIngresso() { return oraIngresso; }
    public void setOraIngresso(LocalTime oraIngresso) { this.oraIngresso = oraIngresso; }
    public LocalTime getOraUscita() { return oraUscita; }
    public void setOraUscita(LocalTime oraUscita) { this.oraUscita = oraUscita; }
    public boolean isAssente() { return assente; }
    public void setAssente(boolean assente) { this.assente = assente; }

    @Override
    public String toString() {
        return "Orario{" +
                "id=" + getId() +
                ", studenteId=" + studenteId +
                ", data=" + data +
                ", oraIngresso=" + oraIngresso +
                ", oraUscita=" + oraUscita +
                ", assente=" + assente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrarioDTO)) return false;
        if (!super.equals(o)) return false;
        OrarioDTO orario = (OrarioDTO) o;
        return Objects.equals(studenteId, orario.studenteId) &&
                Objects.equals(data, orario.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studenteId, data);
    }
}