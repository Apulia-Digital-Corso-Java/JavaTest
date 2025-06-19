package Dto;

public class CorsoDTO extends BaseDTO {
	private String nomeCorso;
	private int durata;
	private int CorsoID;

	public int getCorsoID() {
		return CorsoID;
	}

	public void setCorsoID(int corsoID) {
		CorsoID = corsoID;
	}

	public CorsoDTO(String nomeCorso, int durata) {
		this.CorsoID = getId();
		this.nomeCorso = nomeCorso;
		this.durata = durata;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public int getDurata() {
		return durata;
	}

	@Override
	public String toString() {
		return nomeCorso + " (" + durata + " ore)";
	}
}
