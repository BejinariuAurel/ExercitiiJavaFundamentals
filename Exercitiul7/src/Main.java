public class Main {
    //Cerinta
    //se da un array de 7 cuvinte, sa se concateneze si sa se afiseze cuvintelede pe pozitiile divizibile cu 3 si mai mari decat 0
    public static void main(String[] args) {
        String [] arrayCuvinte=new String[7];
        arrayCuvinte[0]="ana";
        arrayCuvinte[1]="are";
        arrayCuvinte[2]="mere";
        arrayCuvinte[3]="si";
        arrayCuvinte[4]="da";
        arrayCuvinte[5]="la";
        arrayCuvinte[6]="toti";

        lipirea(arrayCuvinte);


    }
    public static void lipirea(String[] arrayCuvinte){
        String text="";
        for(int cursor=1; cursor<arrayCuvinte.length; cursor++){
           if(cursor%3==0){
              text= text.concat(arrayCuvinte[cursor]);
           }
        }
        System.out.println("rezultattul este :"+text);
    }
}
