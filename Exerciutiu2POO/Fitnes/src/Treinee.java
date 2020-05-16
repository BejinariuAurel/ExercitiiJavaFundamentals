public class Treinee {
    private String name;
    private int stamina=500;
    private int strength=50;

    public Treinee(String name){
        this.name=name;
    }
    public void cardio(){
        System.out.println("Facem cardio");
        System.out.println("ati ars de 300 calorii");
        stamina-=30;
        strength+=10;

    }
    public void bodyPump(){
        System.out.println("Fecem body Pump");
        System.out.println("Ati ars de 500 calorii");
        stamina-=50;
        strength+=10;
    }
    public void box(){
        System.out.println("Facem box");
        System.out.println("Ati ars 250 de calorii");
        stamina-=70;
        strength+=10;
    }
    public String getName(){
        return name;
    }
    public int getStamina(){
        return  stamina;
    }
    public int getStrength(){
        return strength;
    }


}
