import java.util.Date;

public class ProduseAlimentare extends Produse {
    private String alergeni;
    private Date dataDeExpirare;
    public ProduseAlimentare(){

    }
    public ProduseAlimentare( String nume, int pret, String alergeni, Date dataDeExpirare){
        this.alergeni=alergeni;
        this.dataDeExpirare=dataDeExpirare;
        this.nume=nume;
        this.pret=pret;
    }
    public String getAlergeni(){
        return alergeni;
    }
    public Date getDataDeExpirare(){
        return dataDeExpirare;
    }

}
