package Dto;

public class CorosoUtente {
    private CorsoDTO corso;
    private UtenteDTO utente;
    
    public UtenteDTO getUtente() {
        return utente;
    }

    public void setUtente(UtenteDTO utente) {
        this.utente = utente;
    }

    public CorsoDTO getCorso() {
        return corso;
    }

    public void setCorso(CorsoDTO corso) {
        this.corso = corso;
    }

}
