package Dto;

import java.time.Instant;
import java.util.Date;

public class AccountDTO extends  BaseDTO{

	private String username;
	private String password;
	private String email;
	private String telNumber;
	private Date dataAccesso;

	private UtenteDTO utente;

	public AccountDTO (String username, String password, String email, String telNumber, UtenteDTO utente) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.telNumber = telNumber;
		this.dataAccesso = Date.from(Instant.now());

		this.utente = utente;
	}

	public AccountDTO () {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail () {
		return email;
	}

	public void setEmail (String email) {
		this.email = email;
	}

	public String getTelNumber () {
		return telNumber;
	}

	public void setTelNumber (String telNumber) {
		this.telNumber = telNumber;
	}

	public Date getDataAccesso () {
		return dataAccesso;
	}

	public String login(UtenteDTO u)
	{
		if (this.utente.equals(u)){
			return "L' " + this.utente.toString() + " ha eseguito il login in data: " + this.dataAccesso;
		}
		return "L'Utente non può loggarsi!";
	}

	public String logout (UtenteDTO u){
		if(!this.utente.equals(u)){
			return "L'utente non può eseguire il logout senza aver eseguito prima il login";
		}
		return "L' " + u.toString() + " ha eseguito il logout";
	}


}
