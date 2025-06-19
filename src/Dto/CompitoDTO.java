package Dto;

import java.util.Objects;

public class CompitoDTO extends BaseDTO {
    private String titolo;
    private String argomento;
    private String unitaDidattica;
    private String descrizione;
    private int durataMassima;
    private Long corsoId;

    public CompitoDTO() {
        super();
    }

    public CompitoDTO(String titolo, Long corsoId) {
        super();
        this.titolo = titolo;
        this.corsoId = corsoId;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    public String getUnitaDidattica() {
        return unitaDidattica;
    }

    public void setUnitaDidattica(String unitaDidattica) {
        this.unitaDidattica = unitaDidattica;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getDurataMassima() {
        return durataMassima;
    }

    public void setDurataMassima(int durataMassima) {
        this.durataMassima = durataMassima;
    }

    public Long getCorsoId() {
        return corsoId;
    }

    public void setCorsoId(Long corsoId) {
        this.corsoId = corsoId;
    }

    @Override
    public String toString() {
        return "Compito{" +
                "id=" + getId() +
                ", titolo='" + titolo + '\'' +
                ", corsoId=" + corsoId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompitoDTO)) return false;
        if (!super.equals(o)) return false;
        CompitoDTO compito = (CompitoDTO) o;
        return Objects.equals(titolo, compito.titolo) &&
                Objects.equals(corsoId, compito.corsoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), titolo, corsoId);
    }
}