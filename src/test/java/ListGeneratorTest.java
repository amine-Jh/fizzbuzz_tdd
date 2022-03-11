import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListGeneratorTest {


    @Test
    public void generateList(){

       List  liste=  ListGenerator.createList();

        Assertions.assertNull(liste);
        Assertions.assertInstanceOf(List.class,liste);


    }
}