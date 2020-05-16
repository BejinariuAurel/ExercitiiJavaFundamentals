public class Produse {
    protected String nume;
    protected int pret;
    public Produse(){
    }
    public Produse(String nume, int pret){
        this.nume=nume;
        this.pret=pret;

    }

    public int getPret() {
        return pret;
    }
    public String getNume(){
        return nume;
    }

}
