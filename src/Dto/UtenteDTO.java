package Dto;

import java.util.Objects;

public class UtenteDTO extends BaseDTO {
	private String nome;
	private String cognome;
	private int utenteID;
	public int getUtenteID() {
		return utenteID;
	}

	public void setUtenteID(int utenteID) {
		this.utenteID = utenteID;
	}

	// Costruttori
	public UtenteDTO () {
		super();
	}

	public UtenteDTO (String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	// Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	// Override toString
	@Override
	public String toString() {
		return "Utente{" +
			"id=" + getId() +
			", nome='" + nome + '\'' +
			", cognome='" + cognome + '\'' +
			'}';
	}

	// Override equals
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof UtenteDTO)) return false;
		UtenteDTO utente = (UtenteDTO) o;
		return Objects.equals(getId(), utente.getId()) &&
			Objects.equals(nome, utente.nome) &&
			Objects.equals(cognome, utente.cognome);
	}

	// Override hashCode
	@Override
	public int hashCode() {
		return Objects.hash(getId(), nome, cognome);
	}
}

