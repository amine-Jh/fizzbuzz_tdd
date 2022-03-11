import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzCalculatorTest {


    @Test
    public void shouldReturnFuzzWhen3(){


        FizzBuzzCalculator fizzBuzzCalculator=new FizzBuzzCalculator();
        Object result= FizzBuzzCalculator.convertValue(3);
        Assertions.assertEquals("fuzz",result);
    }

}