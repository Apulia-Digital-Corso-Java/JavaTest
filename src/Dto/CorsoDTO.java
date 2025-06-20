package Dto;

import java.util.ArrayList;
import java.util.List;

public class CorsoDTO extends BaseDTO {
	private String nomeCorso;
	private int durata;
	private List<UtenteDTO> utentiIscritti;

	public CorsoDTO(String nomeCorso, int durata) {
		this.nomeCorso = nomeCorso;
		this.durata = durata;
		this.utentiIscritti = new ArrayList<>();
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public int getDurata() {
		return durata;
	}

	public List<UtenteDTO> getUtentiIscritti() {
		return utentiIscritti;
	}

	public void iscriviUtente(UtenteDTO utente) {
		if (!utentiIscritti.contains(utente)) {
			utentiIscritti.add(utente);
		}
	}

	public void rimuoviUtente(UtenteDTO utente) {
		utentiIscritti.remove(utente);
	}

	@Override
	public String toString() {
		return nomeCorso + " (" + durata + " ore), Iscritti: " + utentiIscritti.size();
	}
}
