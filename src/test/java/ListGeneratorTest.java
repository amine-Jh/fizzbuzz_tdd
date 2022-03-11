import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListGeneratorTest {


    @Test
    public void shouldReturnAListOfObject(){

       List  liste=  ListGenerator.createList();
        Assertions.assertNotNull(liste);
        Assertions.assertInstanceOf(List.class,liste);

    }
}