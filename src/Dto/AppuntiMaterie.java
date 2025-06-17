import UtenteDTO;


public class AppuntiMaterie  extends BaseDTO {
    private UtenteDTO utente;
    private String nomeFilePDF;

    public AppuntiMaterie  extends BaseDTO (UtenteDTO utente, String nomeFilePDF) {
        this.utente = utente;
        this.nomeFilePDF = nomeFilePDF;
    }

    public String getNomeFilePDF() {
        return nomeFilePDF;
    }

    public void setNomeFilePDF(String nomeFilePDF) {
        this.nomeFilePDF = nomeFilePDF;
    }


}