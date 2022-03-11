public class FizzBuzzCalculator {
    public static Object convertValue(int i) {


        if(i%3==0 ){
            return "fuzz";
        }
        else if( i%5==0)
            return "buzz";

        return i;
    }
}
