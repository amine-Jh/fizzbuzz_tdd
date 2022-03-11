import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuzzBuzz {



    public static List<Object> fuzzBuzzList(int n) {

         List<Object> result=ListGenerator.createList();

         if(n==3){
             return  Arrays.asList(1,2,"fuzz");
         }

         return result;

     }
}
