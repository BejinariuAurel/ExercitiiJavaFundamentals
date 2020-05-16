import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Main {
    //cerinta
    //sa se modeleze comportamentul unui calculator simplu reprezentat pe POO
    // (adunare, scadere, inmyltire, impartire)
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Suma numerelor  12 si 32 este " + calculator.adunare(12, 32));
        System.out.println("Diferenta numerelor 32 si 12 este " + calculator.scadere(32, 12));

        int inmultire = calculator.inmultire(2, 3);
        System.out.println("Rezultatul inmultirii a numerelor 12 si 32 este " + inmultire);
        int impartire = calculator.impartire(32, 12);
        System.out.println("Rezultatul impartirii a numerelor 32 si 12 este " + impartire);

        // de aici citim valorile de la tastatura
        //obiectul care ne ajuta sa facem asta se numeste "Scanner"
        Scanner scaner = new Scanner(System.in);
        System.out.println("Va rugam introduceti primul numar ");
        int a = scaner.nextInt();//-citeste primul numar de la tastatura
        System.out.println("Va rugam introduceti al 2-lea numar");
        int b = scaner.nextInt();//-citim al 2lea numar de la tastatura
        System.out.println("Numerele introduse sunt " + a + " si " + b);

        int adunare = calculator.adunare(a, b);
        System.out.println("Suma numerelor este " + adunare);

        int scadere = calculator.scadere(a, b);
        System.out.println("Diferenta numerelor este " + scadere);

        inmultire = calculator.inmultire(a, b);
        System.out.println("Rezultatu inmultirii celor 2 numere este " + inmultire);

        impartire = calculator.impartire(a, b);
        System.out.println("Rezultatul impartirii este " + impartire);

        //Sa se modeleze un calculator stiintific care sa mosteneasca calculatorul simplu
        //

        CalculatorStiintific calculatorStiintific = new CalculatorStiintific();
        System.out.println("Adunarea este " + calculatorStiintific.adunare(12, 6));
        System.out.println("Scaderea este " + calculatorStiintific.scadere(12, 6));
        System.out.println("Inmultirea este " + calculatorStiintific.inmultire(12, 6));
        System.out.println("Impartirea este " + calculatorStiintific.impartire(12, 6));

        //-numar ridicat la puterea altui numar
        double ridicareLaPutere = calculatorStiintific.ridicareLaPutere(12, 6);
        System.out.println("Ridicarea la putere " + ridicareLaPutere);

        //-radicalul unui numar
        double radical = calculatorStiintific.radicalulNumarului(9);
        System.out.println("RRadicalul unui numar " + radical);

        //-logaritmul in baza 10 a unui numar
        double logaritm10 = calculatorStiintific.logaritm10(100);
        System.out.println("Logaritm in baza 10 " + logaritm10);

        //-logaritm in baza 2 a unui numar
        double logaritmNUmar = calculatorStiintific.logaritm(20);
        System.out.println("Logaritm in baza 2 " + logaritmNUmar);

        Scanner scaner1 = new Scanner(System.in);

        System.out.println("Va rudam introduceti primul numar pentru ridicare la piutere");
        a = scaner1.nextInt();
        System.out.println("Va rugam introduceti puterea");
        b = scaner1.nextInt();
        ridicareLaPutere = calculatorStiintific.ridicareLaPutere(a, b);
        System.out.println("Rezultatul ridicarii la putere a numarului " + a + " la puterea " + b + " este " + ridicareLaPutere);

        System.out.println("Va rudam introduceti numarul pentru calcularea radicalului");
        a = scaner1.nextInt();
        System.out.println("Radicalul numarului " + a + " este " + radical);

        System.out.println("Va rugam numarul pentru calcularea logarimului in baza 10");
        a = scaner1.nextInt();
        System.out.println("Rezultatul logarimic in baza 10 a numarului " + a + " este " + logaritm10);

        System.out.println("Va rugam introduceti numarul pentru a i se afla logarimul in baza2");
        a = scaner1.nextInt();
        System.out.println("rezultatul in baza 2 a numarului " + a + " este " + logaritmNUmar);

        //Va rugam sa introduceti 2 numere
        //afisam numerele
        //Sa se afiseze meniul
        //1.Adunare
        //2.Scadere
        //3.Radical
        //4.scadere
        //afisam mesajul "va rugam alegeti operatia
        //in fuctie de opriune se realizeaza operatia respectiva
        //facem operatia si pentru al 2-lea numar
        //afisam rezultatul
        int optiune = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugam introduceti 2 numere");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("numerele alese sunt : " + a + " si " + b);
        System.out.println("Meniu");
        System.out.println("1.Adunare");
        System.out.println("2.Inmultire");
        System.out.println("3.Radical");
        System.out.println("4.Scadere");
        System.out.println("Va rugam alegeti o operatie");
        optiune = sc.nextInt();//-utilizatorul alege o ptiune de la tastatura
        while (optiune != 9) {
            if (optiune == 1) {
                System.out.println("Ati ales operatia de Adunare");
                System.out.println("Rezultatul adunarii este ;" + calculatorStiintific.adunare(a, b));
            } else if (optiune == 2) {
                System.out.println("Ati ales operatia de inmultire");
                System.out.println("Rsultatul inmultirii este :" + calculatorStiintific.inmultire(a, b));
            } else if (optiune == 3) {
                System.out.println("Ati ales operatia radical");
                System.out.println("Rezultatul radicalului numarului " + a + " este : " + calculatorStiintific.radicalulNumarului(a));
                System.out.println("Rezultatul radicalului numarului " + b + " este : " + calculatorStiintific.radicalulNumarului(b));
            } else if (optiune == 4) {
                System.out.println("Ati ales operatia de scadere");
                System.out.println("Rezultatul scaderii este ; " + calculatorStiintific.scadere(a, b));

            } else {
                System.out.println("NU gasim optiunea aleasa de dvs");
            }
            optiune = sc.nextInt();

        }
        System.out.println("Ati apasat tasta 9, am iesit din program. O zi buna");
        Scanner string = new Scanner(System.in);
        System.out.println("Va rugam introduceti primul String");
        String primulString = string.nextLine();
        System.out.println("Ati introdus textul: " + primulString);
        System.out.println("Va rugam introduceti al 2-lea string");
        String alDoineaString = string.nextLine();
        System.out.println("Ati introdus textul :" + alDoineaString);

        CalculatorString calculatorString = new CalculatorString();

        System.out.println("Rezultatul concatenarii textelor " + primulString + " si " + alDoineaString + " este " + calculatorString.concatenare(primulString, alDoineaString));
        System.out.println("Verificam daca stringul contine un anumit caracter "+calculatorString.contineCaracter(primulString, 'a'));
        System.out.println("Adunarea celor 2 stringuri este : "+calculatorString.adunareStringuri(primulString,alDoineaString));
        System.out.println("Verificam daca stringul este impar sau par "+ calculatorString.stringParImpar(primulString));

        char[] sirCaractere=calculatorString.sirCaractere(primulString);
        for(int cursor=0; cursor<sirCaractere.length;cursor++){
            System.out.println("Caracterele sunt : "+sirCaractere[cursor]);
        }

        System.out.println("Transformam un string in array"+calculatorString.sirCaractere(primulString));
        System.out.println("tringul incepe cu o vocala? "+calculatorString.vocala(primulString));
        System.out.println("numarul spatiilor din string este de : "+calculatorString.spatiiString(primulString));

    }
}
