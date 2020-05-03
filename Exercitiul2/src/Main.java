public class Main {
    //dintr-un vector de 10 elemente intregi sa gasim cel mai mare numar;
    public static void main(String[] args) {
        int[] array=new int[10];
        array[0]=12;
        array[1]=22;
        array[2]=11;
        array[3]=54;
        array[4]=23;
        array[5]=9;
        array[6]=55;
        array[7]=5;
        array[8]=31;
        array[9]=8;

        int valoare=celMaiMare(array);
        System.out.println("Cel mai mare numar din array este / "+ valoare);

    }
    public static int celMaiMare(int[] array) {
        int celMaiMare = array[0];
        for (int cursor = 0; cursor < array.length; cursor++) {
            if (array[cursor] > celMaiMare);



        }

        return celMaiMare;
    }
}
