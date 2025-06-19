package Dto;

import java.util.Objects;

public class DispensaDTO extends BaseDTO {
    private String titolo;
    private Long corsoId;
    private String autore;
    private String descrizione;
    private String url;

    public DispensaDTO() { super(); }

    public DispensaDTO(String titolo, Long corsoId, String autore) {
        super();
        this.titolo = titolo;
        this.corsoId = corsoId;
        this.autore = autore;
    }

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }
    public Long getCorsoId() { return corsoId; }
    public void setCorsoId(Long corsoId) { this.corsoId = corsoId; }
    public String getAutore() { return autore; }
    public void setAutore(String autore) { this.autore = autore; }
    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    @Override
    public String toString() {
        return "Dispensa{" +
                "id=" + getId() +
                ", titolo='" + titolo + '\'' +
                ", corsoId=" + corsoId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DispensaDTO)) return false;
        if (!super.equals(o)) return false;
        DispensaDTO dispensa = (DispensaDTO) o;
        return Objects.equals(titolo, dispensa.titolo) &&
                Objects.equals(corsoId, dispensa.corsoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), titolo, corsoId);
    }
}