import javax.swing.*;
import java.util.Scanner;

public class Main {
    //sa se modeleze cosul de cumparaturi dintr-un supermarket
    //Fiecare produs sa fie reprezentat de un obiect care sa contina nume si pret mere-10lei
    //cosul de cumparaturi va fi reprezentat de un array de produse
    //sa se afiseze costul total cu produse dorite
    //bazat pe ce se introduce de la tastaura, adaugam in cos
    //sa calculam costul total al cosului
    //simulam plata pentru cosul de cumparaturi (cosul se goleste)

    //
    public static void main(String[] args) {


        Produse[] cosulDeCumparaturi=new Produse[10];
        System.out.println("Meniu Cumparaturi");
        System.out.println("1. Mere");
        System.out.println("2. Matura");
        System.out.println("3.Set de farfurii");
        System.out.println("4.Mustar");
        System.out.println("5.Apa");
        System.out.println("6.Bere");
        System.out.println("7.Suc");
        System.out.println("Va rugam alegeti produsele din meniu");
        Scanner scanner=new Scanner(System.in);
        int optiuni=scanner.nextInt();
        while(optiuni!=0){
            if(optiuni==1){
                System.out.println("Ati adaugat in cos, mere");
                Produse mere=new Produse("Mere",5);
                cosulDeCumparaturi[0]=mere;
                System.out.println("Am adaugat "+cosulDeCumparaturi[0].getNume()+" si " +cosulDeCumparaturi[0].getPret());
            }
            else if(optiuni==2){
                System.out.println("Ati adaugat in cos,Matura");
                Produse matura=new Produse("Matura",6);
                cosulDeCumparaturi[1]= matura;
                System.out.println("Am adaugat "+cosulDeCumparaturi[1].getNume()+" si " +cosulDeCumparaturi[1].getPret());
            }else if(optiuni==3){
                System.out.println("Ati adaugat in cos, Set de farfurii");
                Produse setDeFarfurii=new Produse( "Set de Farfurii",7);
                cosulDeCumparaturi[2]=setDeFarfurii;
                System.out.println("Am adaugat "+cosulDeCumparaturi[2].getNume()+" si " +cosulDeCumparaturi[2].getPret());

            }else if(optiuni==4){
                System.out.println("Ati adaugat in cos, Mustar");
                Produse mustar=new Produse("Mustar",12);
                cosulDeCumparaturi[3]=mustar;
                System.out.println("Am adaugat "+cosulDeCumparaturi[3].getNume()+" si " +cosulDeCumparaturi[3].getPret());
            }else if(optiuni==5){
                System.out.println("Ati adaugat in cos,Apa");
                Produse apa=new Produse("Apa",4);
                cosulDeCumparaturi[4]=apa;
                System.out.println("Am adaugat "+cosulDeCumparaturi[4].getNume()+" si " +cosulDeCumparaturi[4].getPret());
            }else if(optiuni==6){
                System.out.println("Ati adaugat in cos, Bere");
                Produse bere=new Produse("Bere", 15);
                cosulDeCumparaturi[5]=bere;
                System.out.println("Am adaugat "+cosulDeCumparaturi[5].getNume()+" si " +cosulDeCumparaturi[5].getPret());
            }else if (optiuni==7){
                System.out.println("Ati adaugat in cos, Suc");
                Produse suc=new Produse("Suc", 5);
                cosulDeCumparaturi[6]=suc;
                System.out.println("Am adaugat "+cosulDeCumparaturi[6].getNume()+" si " +cosulDeCumparaturi[6].getPret());
            }
            else {
                System.out.println("Produsul nu exista in lista");
            }
            optiuni=scanner.nextInt();
        }
        System.out.println("Ati apasat tasta 0, programul se inchide, La revedere");
        System.out.println("Ati cumparat");

        for (int cursor=0; cursor<cosulDeCumparaturi.length; cursor++)
        {if (cosulDeCumparaturi[cursor]!=null){

            System.out.println(cosulDeCumparaturi[cursor].getNume()+" la pretul de : "+cosulDeCumparaturi[cursor].getPret());
            }
        }
        int pretTotal=0;
        for (int cursor=0; cursor<cosulDeCumparaturi.length; cursor++){
            if(cosulDeCumparaturi[cursor]!=null){
            //aici facem supa preturilot
            pretTotal+=cosulDeCumparaturi[cursor].getPret();

        }
        }
        System.out.println("Pretul Total al cosului este: "+pretTotal);

        System.out.println("S-au platit cumparaturile");
        pretTotal=0;
        //sa se reprezinte si produse perisabile, care vor avea in plus data expirarii, sa se simuleze din nou un cos de cumparaturi
        //iar daca cumparatorul selecteaza un produs perisabil si data-i depasita, vom afisa un mesaj" prudus expirat" si nu-l vom mai adauga in cos
        //sa adaugam si alergenii, cand afisam cosul de cumparaturi sa afisam si alergenii
        //un cos de cumparaturi nonalimenrate si unul pentru produsele alimentare
        ProduseAlimentare[] cosPerisabile=new ProduseAlimentare[10];
        Produse[] cosNeperisabile=new  Produse[10];
        
    }





}