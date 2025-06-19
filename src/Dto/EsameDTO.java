package Dto;

import java.time.LocalDate;
import java.util.Objects;

public class EsameDTO extends BaseDTO {
    private String nomeEsame;
    private Long corsoId;
    private LocalDate dataEsame;
    private String voto;
    private String descrizione;

    public EsameDTO() { super(); }

    public EsameDTO(String nomeEsame, Long corsoId, LocalDate dataEsame) {
        super();
        this.nomeEsame = nomeEsame;
        this.corsoId = corsoId;
        this.dataEsame = dataEsame;
    }

    public String getNomeEsame() { return nomeEsame; }
    public void setNomeEsame(String nomeEsame) { this.nomeEsame = nomeEsame; }
    public Long getCorsoId() { return corsoId; }
    public void setCorsoId(Long corsoId) { this.corsoId = corsoId; }
    public LocalDate getDataEsame() { return dataEsame; }
    public void setDataEsame(LocalDate dataEsame) { this.dataEsame = dataEsame; }
    public String getVoto() { return voto; }
    public void setVoto(String voto) { this.voto = voto; }
    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    @Override
    public String toString() {
        return "Esame{" +
                "id=" + getId() +
                ", nomeEsame='" + nomeEsame + '\'' +
                ", corsoId=" + corsoId +
                ", dataEsame=" + dataEsame +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EsameDTO)) return false;
        if (!super.equals(o)) return false;
        EsameDTO esame = (EsameDTO) o;
        return Objects.equals(nomeEsame, esame.nomeEsame) &&
                Objects.equals(corsoId, esame.corsoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nomeEsame, corsoId);
    }
}