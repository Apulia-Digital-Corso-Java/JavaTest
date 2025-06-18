package Dto;

public class CorsoDTO {
    private String nome;
    private int durataOre;

    public CorsoDTO() {

    }

    public CorsoDTO(String nome, int durataOre) {
        this.nome = nome;
        this.durataOre = durataOre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurataOre() {
        return durataOre;
    }

    public void setDurataOre(int durataOre) {
        this.durataOre = durataOre;
    }

    @Override
    public String toString() {
        return nome + " - " + durataOre + " ore";
    }
}
