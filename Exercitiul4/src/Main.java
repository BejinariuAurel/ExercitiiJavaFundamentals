public class Main {
    //cerinta
    // sa se numere toate cuvintele care au lungimea mai mare decat é, contin caracterul i ,si caracterul i se afla pe o pozitie para
    public static void main(String[] args) {
        String text="Obiectul itoriei este ceea ce a pus Adrian Sava in ecercitiul lui si daca a tras de pe net asta inseamna ca sigur are dreptate :))";

        System.out.println("numarul de cuvinte ce contin litera i pe pozitie para este de/ "+numarDeCuvinte(text));
    }
    public static int numarDeCuvinte(String text){
        int numarCuvinte=0;
        String[] cuvinte=text.split(" ");
        for (int cursor=0; cursor<cuvinte.length; cursor++){
            if(cuvinte[cursor].length()>2 && cuvinte[cursor].contains("i")&& cuvinte[cursor].indexOf("i")%2==0){
                numarCuvinte++;

            }

        }
        return numarCuvinte;
    }
}
