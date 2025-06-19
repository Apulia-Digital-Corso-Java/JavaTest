package Dto;

import DB.GestionUtente;
import DB.GestioneCorso;

import java.util.Date;

public class Esame extends BaseDTO{
    private int EsameID;
    private int UtenteID;
    private int CorsoID;
    private float Valutazione;
    private Date DataInserimento;
    private Date DataModifica;

    public float getValutazione() {
        return Valutazione;
    }

    public void setValutazione(float valutazione) {
        Valutazione = valutazione;
    }

    public Date getDataModifica() {
        return DataModifica;
    }

    public void setDataModifica(Date dataModifica) {
        DataModifica = dataModifica;
    }

    public Date getDataInserimento() {
        return DataInserimento;
    }

    public void setDataInserimento(Date dataInserimento) {
        DataInserimento = dataInserimento;
    }



    public Esame(int UtenteID, int CorsoID) {
        this.EsameID = super.getId();
        this.UtenteID = UtenteID;
        this.CorsoID = CorsoID;
    }
    public int getCorsoID() {
        return CorsoID;
    }

    public void setCorsoID(int corsoID) {
        CorsoID = corsoID;
    }

    public int getEsameID() {
        return EsameID;
    }

    public void setEsameID(int esameID) {
        EsameID = esameID;
    }

    public int getUtenteID() {
        return UtenteID;
    }

    public void setUtenteID(int utenteID) {
        UtenteID = utenteID;
    }

    @Override
    public String toString() {
        return "Esame di corso (" + GestioneCorso.getCorso(this.CorsoID).getNomeCorso() + ") per  studente ( " + GestionUtente.getUtente(this.UtenteID).getNome() + " "+ GestionUtente.getUtente(this.UtenteID).getNome() +")" ;
    }
}
