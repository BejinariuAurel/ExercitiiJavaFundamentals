import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayTest {
    ArraysOperations arraysOperations=new ArraysOperations();
    @Test
    public void lungimeaUnuiArray(){
        System.out.println("Testam lungimea arrayului");
        int[] numereINtregi={2,4,6,7,9,3,2,7,5};
        int result=arraysOperations.lungimeaUnuiArray(numereINtregi);
        assertEquals(result,9);
    }
    @Test
    public void numereMaiMari(){
        System.out.println("Testam cate numere mai mari ca 5 avem");
        int[] numereINtregi={2,4,6,7,9,3,2,7,5};
        int result=arraysOperations.numereMaiMari(numereINtregi);
        assertEquals(result,4);
    }
}
