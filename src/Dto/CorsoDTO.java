package Dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CorsoDTO
{
	private String nomeCorso;
	private int durata;
	private UtenteDTO docenteCorso;
	private List<UtenteDTO> listaIscritti= new ArrayList<>();

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

	public List<UtenteDTO> getListaIscritti() {
		return listaIscritti;
	}

	public void setListaIscritti(List<UtenteDTO> listaIscritti) {
		this.listaIscritti = listaIscritti;
	}

	@Override
	public String toString()

	{
		return nomeCorso + " (" + durata + " ore)";
	}

	public Optional<UtenteDTO> trovaIscritto (int idUtente)
	{
		return listaIscritti.stream().filter( u -> u.getId()==idUtente).findFirst();
	}



}
