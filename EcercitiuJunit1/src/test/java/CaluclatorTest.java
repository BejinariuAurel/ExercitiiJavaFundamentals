import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaluclatorTest {
    Calculator calculator=new Calculator();
@Test
    public void addTest(){
    System.out.println("Testam adunarea");
    int a=4;
    int b=3;
    int result=calculator.add(a,b);

    assertEquals(result,7);
}

@Test
    public void diffTest(){
    System.out.println("Testam scaderea");
    int a=5;
    int b=3;
    int result=calculator.deff(a,b);
    assertEquals(result,2);
}
@Test
    public void inmTest(){
    System.out.println("Testam inmultirea");
    int a=4;
    int b=5;
    int result=calculator.inm(a,b);
    assertEquals(result,20);
}
@Test
    public void impTest(){
    System.out.println("Testam impartirea");
    int a=12;
    int b=3;
    int result=calculator.imp(a,b);
    assertEquals(result,4);
}


}
