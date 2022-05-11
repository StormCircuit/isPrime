import java.util.ArrayList;
import java.util.List;

public class PrimeTest{
    
    public static void main(String[] Args){
        assertTrue();
    }

    public static void assertTrue(){
        isPrime c = new isPrime();
        List<Integer> testCases = new ArrayList<Integer>();
        testCases.add(2);
        testCases.add(3);
        testCases.add(4);
        testCases.add(5);
        testCases.add(6);
        int i = 0;
        while(i<testCases.size()){
            System.out.print(testCases.get(i) + " is prime: " + c.isPrime(testCases.get(i)) + "\n");
            i++;
        }
    }
}