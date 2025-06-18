package Dto;

public class CorsoDTO {
    private String nomeCorso;
    private String durata;

    public CorsoDTO(String nomeCorso, String durata) {
        this.nomeCorso = nomeCorso;
        this.durata = durata;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public String getDurata() {
        return durata;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return nomeCorso + " " + durata;
    }
}
