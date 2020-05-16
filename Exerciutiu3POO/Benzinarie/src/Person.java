public class Person {
    String name;
    int money;

    public Person(String name, int money){
        this.name=name;
        this.money=money;
    }
    public String transactieB(int baniDePlatit){
        if(baniDePlatit>this.money){
           return "Fonduri insuficiente";
        }else {
        this.money-=baniDePlatit;
        return "Mai avem "+this.money+"lei";}
    }
    public String tranzactieM(int baniDePlatit){
        if(baniDePlatit>this.money){
            return "Fondur insuficiente";
        }else{
            this.money-=baniDePlatit;
            return "mai avem "+this.money+"lei";
        }
    }
}
