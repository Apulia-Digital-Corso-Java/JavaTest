package Dto;

public class CorsoUtente {

    private CorsoDTO coros;
    private UtenteDTO utente;

    public CorsoUtente(CorsoDTO corso, UtenteDTO utente) {
        this.coros = corso;
        this.utente = utente;
    }

    public CorsoDTO getCoros() {
        return coros;
    }

    public void setCoros(CorsoDTO coros) {
        this.coros = coros;
    }

    public UtenteDTO getUtente() {
        return utente;
    }

    public void setUtente(UtenteDTO utente) {
        this.utente = utente;
    }


    @Override
    public String toString() {
        return "CorsoUtente(" + "coros=" + this.coros + ")" + "(Utente=" + this.utente  + ")";
    }
}
