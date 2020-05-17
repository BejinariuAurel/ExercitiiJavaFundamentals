public class ArraysOperations {
    public int lungimeaUnuiArray(int[] numereIntregi){
        return numereIntregi.length;
    }
    public int numereMaiMari(int[] numere){
       int numereMaiMariCa5=0;
        for (int cursor=0; cursor<numere.length; cursor++){
            if(numere[cursor]>5){
                numereMaiMariCa5++;
            }
        }
        return numereMaiMariCa5;

    }
}
