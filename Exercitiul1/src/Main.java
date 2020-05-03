public class Main {
    //Cerinta
    //o functie care primeste 2 stringuri ca parametri si verifica daca al 2-lea string exista in primul string

    public static void main(String[] args) {
        String text="astazi e o zi cu soare si noi stam in casa";
        String text1="stam in casa";
        verificaIncludere(text,text1);
    }
    public  static void verificaIncludere (String text,String text1){
        if (text.contains(text1)){
            System.out.println("Includerea e totala");
        }else {
            System.out.println("Textul 1 nu este inclus in textul 2");
        }

    }
}
