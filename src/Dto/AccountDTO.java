package Dto;

public class AccountDTO {
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private List<Ruolo> ruoli;

    public AccountDTO() {}

    public AccountDTO(long id, String nome, String cognome, String email, List<Ruolo> ruoli) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.ruoli = ruoli;
    }

    // Getter e Setter ID
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    // Getter e Setter Nome
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // Getter e Setter Cognome
    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    // Getter e Setter Email
    public String getEmail() { return email; }
    public String setEmail(String email) { this.email = email; }

    public List<RuoloDTO> getRuoli() { return ruoli; }

    public void setRuoli(List<ruoloDTO> ruoli) { this.ruoli = ruoli; }

}