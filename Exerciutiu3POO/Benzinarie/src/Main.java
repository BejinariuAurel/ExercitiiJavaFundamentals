import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sa se modeleze o benzinarie
        //Obiecte:
        //Gass station
        // o sa aiba:
        //motorina
        //benzina
        //reprezentate prin cantitate
        //pret pe litru -benzina- motorina
        //de fiecare data scadem cantitatea
        //cand ajungem la 10 litri din cantitate chemam cisterna
        //cand cineva cumpara calculam pretul
        //obiect persoana- cu anumiti bani
        //el o sa plateasca pentru carburant iar suma-i scade
        //persoana poate plati cu o suma rotunda si benzinaria tre sa-i dea rest
        //daca persoana nu are destui bani afisam "fonduri insuficiente



        GassStation omv=new GassStation(100,5,100,6);
        Scanner persoana=new Scanner(System.in);
        System.out.println("Introduceti-va NUmele");
        String name=persoana.nextLine();
        Person cumparator=new Person(name,300);
        Scanner meniu=new Scanner(System.in);
        System.out.println("Va rugam alegeti carburantul");
        System.out.println("1.Motorina");
        System.out.println("2.Benzina");
        int optiune=0;
        optiune=meniu.nextInt();
        Scanner cantitate=new Scanner(System.in);
        System.out.println("introduceti cantitatea");
        int cantitateIntrodusa=cantitate.nextInt();
        System.out.println("Ati introdus cantitatea de "+cantitateIntrodusa+" litri");
        while (optiune!=0){
            if(optiune==1){
                System.out.println("Ati ales sa cumparati Motorina");
               int pretTotal= omv.sellM(cantitateIntrodusa);
                String rezultatTranzactie=cumparator.tranzactieM(pretTotal);
                if (rezultatTranzactie.startsWith("Fonduri insuficiente")){
                    String rezultatIncasare=omv.incaseazaBanii(pretTotal/2,pretTotal);
                    System.out.println("Rezultatul tranzactiei este "+rezultatIncasare);
                }else{
                   String incasare= omv.incaseazaBanii(pretTotal,pretTotal);
                    System.out.println("Rezultatul incasarii este "+incasare);
                    System.out.println("Au mai ramas "+omv.getMotorina()+" litri de motorina");
                }


            }else if(optiune==2){
                System.out.println("Ati ales sa cumparati Benzina");
                int pretTotal=omv.sellB(cantitateIntrodusa);

                String rezultatTranzactie=cumparator.transactieB(pretTotal);
                if(rezultatTranzactie.startsWith("Fonduri insuficiente")){
                    String incasare=omv.incaseazaBanii(pretTotal/2, pretTotal);
                    System.out.println("Rezultatul tranzactiei este "+incasare);
                }else{
                    String incasare=omv.incaseazaBanii();
                }

            }else{

                System.out.println("Nu avem in meniu");
            }
            optiune=meniu.nextInt();
        }


    }
}
