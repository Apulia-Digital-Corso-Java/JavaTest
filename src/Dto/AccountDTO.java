package Dto;

public class AccountDTO extends BaseDTO {
    private String username;
    private String email;
    private String password;
    private String numero;

    // Costruttore vuoto
    public AccountDTO() {
        super();
    }

    // Costruttore completo
    public AccountDTO(Long id, String username, String email, String password, String numero) {
        super();
        this.username = username;
        this.email = email;
        this.password = password;
        this.numero = numero;
    }

    // Getter e Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // toString
    @Override
    public String toString() {
        return "UtenteDTO{" +
                "id=" + getId() +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", numero='" + numero + '\'' +
                ", password='[PROTECTED]'" +
                '}';
    }

}
