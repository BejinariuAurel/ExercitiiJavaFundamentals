public class Main {
    // se da un text , sa se numere cuvintele care au lungime impara si se termina cu litera e
    public static void main(String[] args) {
        String text="Nimeni ne merge afara si nimeni nu merge singur sau singure";
        numarCuvinte(text);
    }
    public static void numarCuvinte(String text){
        int numarCuvinte=0;
        String [] rezultatSplit=text.split(" ");

        for(int cursor=0; cursor<rezultatSplit.length; cursor++){
        if(rezultatSplit[cursor].length()%2!=0 && rezultatSplit[cursor].endsWith("e")){
            numarCuvinte++;
        }
        return numarCuvinte;}
    }
}
