package Dto;

import java.util.Objects;
public class AccountDTO {
    private long id;
    private string nome;
    private string email;
    private List <Ruolo> ruoli;

    public  AccountDTO(){}

    // Geteter e Setter ID
    public long getId() { return id;}
    public void setNome(string nome) {this.nome = nome;}

    // Getter e Setter Nome
    public string getNome() {return nome; }
    public void setNome(String nome) {this.nome=nome;}

    // Getter e Setter Email
    public string getEmail() {return email;}
    public void setEmail(string email) {this.email = email; }

    public List<Ruolo> getRuoli() {return ruoli;}

    public void setRuoli(List<Ruolo> ruoli) { this.ruoli = ruoli; }


}