import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorStiintificTest {
    CalculatorStiintific calculatorStiintific=new CalculatorStiintific();
    @Test
    public void ridicareLaPutere(){
        System.out.println("Testam ridicarea la puere");
        int a=4;
        int b=2;
        double result=calculatorStiintific.ridicareLaPutere(a,b);
        assertEquals(result, 16,0.1);
    }
    @Test
    public void radicalTest(){
        System.out.println("Testam radicalul");
        int a=25;
        double result=calculatorStiintific.radical(a);
        assertEquals(result, 5,0.1);
    }
}
