package Dto;

import java.util.Objects;

public class MateriaDTO extends BaseDTO {
    private String nome;
    private String codiceMateria;
    private String descrizione;
    private int oreSemestre;
    private String dipartimento;
    private boolean obbligatoria;

    public MateriaDTO() { super(); }

    public MateriaDTO(String nome, String codiceMateria) {
        super();
        this.nome = nome;
        this.codiceMateria = codiceMateria;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCodiceMateria() { return codiceMateria; }
    public void setCodiceMateria(String codiceMateria) { this.codiceMateria = codiceMateria; }
    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }
    public int getOreSemestre() { return oreSemestre; }
    public void setOreSemestre(int oreSemestre) { this.oreSemestre = oreSemestre; }
    public String getDipartimento() { return dipartimento; }
    public void setDipartimento(String dipartimento) { this.dipartimento = dipartimento; }
    public boolean isObbligatoria() { return obbligatoria; }
    public void setObbligatoria(boolean obbligatoria) { this.obbligatoria = obbligatoria; }

    @Override
    public String toString() {
        return "Materia{" +
                "id=" + getId() +
                ", nome='" + nome + '\'' +
                ", codiceMateria='" + codiceMateria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MateriaDTO)) return false;
        if (!super.equals(o)) return false;
        MateriaDTO materia = (MateriaDTO) o;
        return Objects.equals(nome, materia.nome) &&
                Objects.equals(codiceMateria, materia.codiceMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, codiceMateria);
    }
}