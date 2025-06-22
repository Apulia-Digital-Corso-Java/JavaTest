package Dto;

public class CorsoDTO
{
	private String nomeCorso;
	private int durata;
	private UtenteDTO docenteCorso;

	public CorsoDTO(String nomeCorso, int durata /*UtenteDTO docenteCorso*/) {
		this.nomeCorso = nomeCorso;
		this.durata = durata;
		this.docenteCorso= docenteCorso;
	}

	public String getNomeCorso()

	{
		return nomeCorso;
	}

	public int getDurata()

	{
		return durata;
	}

	@Override
	public String toString()

	{
		return nomeCorso + " (" + durata + " ore)";
	}


}
