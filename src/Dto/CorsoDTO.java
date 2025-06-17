package Dto;

import java.util.Objects;

public class CorsoDTO extends BaseDTO
{
    private String nome;

    public CorsoDTO(String nome)
    {
        super();
        this.nome = nome;
    }

    public CorsoDTO()
    {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CorsoDTO{" +
                "Nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CorsoDTO corsoDTO)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(nome, corsoDTO.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome);
    }
}
