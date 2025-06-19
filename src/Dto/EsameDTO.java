package Dto;

import java.sql.Date;

public class EsameDTO extends BaseDTO

{
    private long idEsame;
    private CorsoDTO materiaEsame;
    private long idStud; //lo studente che ha partecipato all'esame
    private int valutEsame;
    private Date dataEsame;
    private Date dataCreazOgg; //data in cui è stato creato un oggetto di tipo EsameDTO
    private Date dataUltModOgg; //l'ultima volta in cui un oggetto di tipo EsameDTO è stato modificato

    public EsameDTO(long idEsame, CorsoDTO materiaEsame, long idStud, int valutEsame, Date dataEsame, Date dataCreazOgg, Date dataUltModOgg) {
        this.idEsame = idEsame;
        this.materiaEsame = materiaEsame;
        this.idStud = idStud;
        this.valutEsame = valutEsame;
        this.dataEsame = dataEsame;
        this.dataCreazOgg = dataCreazOgg;
        this.dataUltModOgg = dataUltModOgg;
    }


}