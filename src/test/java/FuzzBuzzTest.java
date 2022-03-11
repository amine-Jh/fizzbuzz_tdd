import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FuzzBuzzTest {

    @Test
    public void shouldReturn_1_2_Fuzz_When3(){

        List<Object> expected = Arrays.asList(1,2,"fuzz");
        List<Object> result   = FuzzBuzz.fuzzBuzzList(3);
        Assertions.assertEquals(expected,result);
    }


    @Test
    public void shouldReturn_1_2_Fuzz_4_When4(){

        List<Object> expected = Arrays.asList(1,2,"fuzz",4);
        List<Object> result   = FuzzBuzz.fuzzBuzzList(4);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void shouldReturn_1_2_FuzzWhen10(){

        List<Object> expected = Arrays.asList(1,2,"fuzz",4,"buzz","fuzz",7,8,"fuzz","buzz");
        List<Object> result   = FuzzBuzz.fuzzBuzzList(10);
        Assertions.assertEquals(expected,result);
    }


}