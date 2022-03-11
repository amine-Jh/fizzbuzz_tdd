import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzCalculatorTest {


    @Test
    public void shouldReturnFuzzWhen3(){


        FizzBuzzCalculator fizzBuzzCalculator=new FizzBuzzCalculator();
        Object result= FizzBuzzCalculator.convertValue(6);
        Assertions.assertEquals("fuzz",result);
    }
    @Test
    public void shouldReturnBuzzWhen5(){


        FizzBuzzCalculator fizzFuzzCalculator=new FizzBuzzCalculator();
        Object result= FizzBuzzCalculator.convertValue(5);
        Assertions.assertEquals("buzz",result);
    }

}