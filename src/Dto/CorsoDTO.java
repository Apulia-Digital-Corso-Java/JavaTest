package Dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class CorsoDTO extends BaseDTO
{
    private String nome;
    private int durOre;

    public CorsoDTO()
    {
        super();
    }

    public CorsoDTO(String nome, int durOre) {
        this.nome = nome;
        this.durOre = durOre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurOre() {
        return durOre;
    }

    public void setDurOre(int durOre) {
        this.durOre = durOre;
    }

    @Override
    public String toString() {
        return "CorsoDTO{" +
                "nome='" + nome + '\'' +
                ", durOre=" + durOre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CorsoDTO corsoDTO = (CorsoDTO) o;
        return durOre == corsoDTO.durOre && Objects.equals(nome, corsoDTO.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, durOre);
    }
}
