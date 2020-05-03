public class Main {
    //cerinte
    //sa se afiseze toate cuvintele care incep cu litera "s" sau cu litera "d"
    // sa se afisezelitera de la pozitia 3 din fiecare cuvant$

    public static void main(String[] args) {
        String text="spre deosebire de povestirea functionala, luatul de pe wikipedia e cel mai folosit si mai ales cititul de pe deed strip sau sher";
        cuvinteCuSsiD(text);
        pozitia3(text);
    }
    public static void cuvinteCuSsiD(String text){
        String [] nrCuvinte=text.split(" ");
            for (int cursor=0;cursor<nrCuvinte.length; cursor++){
                if(nrCuvinte[cursor].startsWith("s") ||  nrCuvinte[cursor].startsWith("d")){
                    System.out.println("cuvint care incepe cu s dau d: "+ nrCuvinte[cursor]);
                }
            }
    }
    public static void pozitia3(String text){
        String []sirtext=text.split(" ");
        for(int cursor=0;cursor<sirtext.length;cursor++){
            if(sirtext[cursor].length()>3){
            System.out.println("Litera de pe pozitia 3 a cuvantului -->"+sirtext[cursor]+ "<-- este -->" +sirtext[cursor].charAt(2));

        } }
    }
}
