package Dto;

import java.sql.Date;

public class EsameDTO extends BaseDTO

{
    private CorsoDTO materiaEsame;
    private int idStud; //lo studente che ha partecipato all'esame
    private int valutEsame;
    private Date dataEsame;
    private Date dataCreazOgg; //data in cui è stato creato un oggetto di tipo EsameDTO
    private Date dataUltModOgg; //l'ultima volta in cui un oggetto di tipo EsameDTO è stato modificato

    public EsameDTO(CorsoDTO materiaEsame, int idStud, int valutEsame, Date dataEsame, Date dataCreazOgg, Date dataUltModOgg) {
        super();
        this.materiaEsame = materiaEsame;
        this.idStud = idStud;
        this.valutEsame = valutEsame;
        this.dataEsame = dataEsame;
        this.dataCreazOgg = dataCreazOgg;
        this.dataUltModOgg = dataUltModOgg;
    }

    public CorsoDTO getMateriaEsame() {
        return materiaEsame;
    }

    public int getIdStud() {
        return idStud;
    }


    public int getValutEsame() {
        return valutEsame;
    }


    public Date getDataEsame() {
        return dataEsame;
    }


    public Date getDataCreazOgg() {
        return dataCreazOgg;
    }

    public void setDataCreazOgg(Date dataCreazOgg) {
        this.dataCreazOgg = dataCreazOgg;
    }

    public Date getDataUltModOgg() {
        return dataUltModOgg;
    }

    public void setDataUltModOgg(Date dataUltModOgg) {
        this.dataUltModOgg = dataUltModOgg;
    }





}