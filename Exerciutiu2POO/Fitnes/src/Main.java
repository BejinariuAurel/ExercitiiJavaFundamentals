import java.util.Scanner;

public class Main {
    // sa se modeleze o sedinta de training
    //vom avea:
    // Treinee (cursantul)
    // nume
    //Stamina
    // Strength
    //treinee-ul se antreneaza luni miercuri si vineri
    // o sa porneasca su stamina 100, dupa fiecare exercitiu stamina-i scade si puterea-i creste
    //porneste cu streigth 50
    //luni face cardio
    //miercuti face body pump
    //vineri box
    //cardio scade stamina cu 50
    //afisare  ati ars 300 calorii
    //body pump scad stamina cu 50
    //afisare ati ars 500 calorii
    //box scade cu 70
    // afisare ati ars 250 calorii
    //stamina >0
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("Va rugam introduceti numele treineeului ");
        String nume=name.nextLine();



        Treinee ion = new Treinee(nume);

        Scanner zi = new Scanner(System.in);
        System.out.println("Introduceti ziua curenta");
        String ziCurenta = zi.nextLine();
        while ((ziCurenta.equals("Luni") || ziCurenta.equals("Miercuri") || ziCurenta.equals("Vineri")) && ion.getStamina() > 0) {
            switch (ziCurenta) {
                case "Luni":
                    ion.cardio();
                    System.out.println("Stamina a ajuns la "+ion.getStamina());
                    break;
                case "Miercuti":
                    ion.bodyPump();
                    System.out.println("Stamina a ajuns la "+ion.getStamina());
                    break;
                case "Vineri":
                    ion.box();
                    System.out.println("Stamina a ajuns la "+ion.getStamina());
                    break;
                default:
                    System.out.println("Liber");
                    break;
            }
            ziCurenta=zi.nextLine();
        }
        System.out.println("Ati introdus "+ziCurenta+" si nu se antreanaza astazi");
        if(!ziCurenta.equals("Luni")||!ziCurenta.equals("Miercuri")||!ziCurenta.equals("Vineri")){
            System.out.println("Aztazi nu se antreneaza");
        }
        if(ion.getStamina()<=0){
            System.out.println(ion.getName()+" a obosit");

        }
        System.out.println("Strength lui "+ion.getName()+" a ajuns la "+ion.getStrength());
    }
}
