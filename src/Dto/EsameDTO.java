package Dto;

import java.time.LocalDateTime;

public class EsameDTO {
	private UtenteDTO utente;
	private CorsoDTO corso;
	private String dataEsame;
	private int voto;
	private boolean superato;
	private LocalDateTime dataInserimento;
	private LocalDateTime dataModifica;

	public EsameDTO(UtenteDTO utente, CorsoDTO corso, String dataEsame, int voto) {
		this.utente = utente;
		this.corso = corso;
		this.dataEsame = dataEsame;
		this.voto = voto;
		this.superato = voto >= 18;
		this.dataInserimento = LocalDateTime.now();
		this.dataModifica = LocalDateTime.now();
	}

	// GETTER
	public UtenteDTO getUtente() {
		return utente;
	}

	public CorsoDTO getCorso() {
		return corso;
	}

	public String getDataEsame() {
		return dataEsame;
	}

	public int getVoto() {
		return voto;
	}

	public boolean isSuperato() {
		return superato;
	}

	public LocalDateTime getDataInserimento() {
		return dataInserimento;
	}

	public LocalDateTime getDataModifica() {
		return dataModifica;
	}

	// SETTER
	public void setUtente(UtenteDTO utente) {
		this.utente = utente;
		this.dataModifica = LocalDateTime.now();
	}

	public void setCorso(CorsoDTO corso) {
		this.corso = corso;
		this.dataModifica = LocalDateTime.now();
	}

	public void setDataEsame(String dataEsame) {
		this.dataEsame = dataEsame;
		this.dataModifica = LocalDateTime.now();
	}

	public void setVoto(int voto) {
		this.voto = voto;
		this.superato = voto >= 18;
		this.dataModifica = LocalDateTime.now();
	}

	public void setSuperato(boolean superato) {
		this.superato = superato;
		this.dataModifica = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "Esame{" +
			"utente=" + utente.getNome() + " " + utente.getCognome() +
			", corso=" + corso.getNomeCorso() +
			", dataEsame='" + dataEsame + '\'' +
			", voto=" + voto +
			", superato=" + superato +
			", dataInserimento=" + dataInserimento +
			", dataModifica=" + dataModifica +
			'}';
	}
}


