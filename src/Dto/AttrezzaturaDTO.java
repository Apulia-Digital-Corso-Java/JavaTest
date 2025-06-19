package Dto;

import java.time.LocalDate;
import java.util.Objects;

public class AttrezzaturaDTO extends BaseDTO {
    private String nome;
    private String codiceInventario;
    private String tipo;
    private String marca;
    private String modello;
    private LocalDate dataAcquisto;
    private String stato;
    private String ubicazione;
    private String descrizione;
    private double costoAcquisto;

    public AttrezzaturaDTO() { super(); }

    public AttrezzaturaDTO(String nome, String codiceInventario) {
        super();
        this.nome = nome;
        this.codiceInventario = codiceInventario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCodiceInventario() { return codiceInventario; }
    public void setCodiceInventario(String codiceInventario) { this.codiceInventario = codiceInventario; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModello() { return modello; }
    public void setModello(String modello) { this.modello = modello; }
    public LocalDate getDataAcquisto() { return dataAcquisto; }
    public void setDataAcquisto(LocalDate dataAcquisto) { this.dataAcquisto = dataAcquisto; }
    public String getStato() { return stato; }
    public void setStato(String stato) { this.stato = stato; }
    public String getUbicazione() { return ubicazione; }
    public void setUbicazione(String ubicazione) { this.ubicazione = ubicazione; }
    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }
    public double getCostoAcquisto() { return costoAcquisto; }
    public void setCostoAcquisto(double costoAcquisto) { this.costoAcquisto = costoAcquisto; }

    @Override
    public String toString() {
        return "Attrezzatura{" +
                "id=" + getId() +
                ", nome='" + nome + '\'' +
                ", codiceInventario='" + codiceInventario + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttrezzaturaDTO)) return false;
        if (!super.equals(o)) return false;
        AttrezzaturaDTO att = (AttrezzaturaDTO) o;
        return Objects.equals(codiceInventario, att.codiceInventario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codiceInventario);
    }
}