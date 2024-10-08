package Logic;
import java.util.Arrays;

public class FindMissingNumber {
	
	public static void main(String[] args) {
        //10 is missing
        int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};
         
        int N = 12;
        int idealSum = (N * (N + 1)) / 2;
        int sum = calculateSum(numbers);
 
        int missingNumber = idealSum - sum;
        System.out.println(missingNumber);
        
        // with Java8
        
        java8();
    }
 
    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
    
    public static void java8() {
        //10 is missing
        int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};
         
        int N = 12;
        int idealSum = (N * (N + 1)) / 2;
        int sum = Arrays.stream(numbers).sum();
 
        int missingNumber = idealSum - sum;
        System.out.println(missingNumber);
    }

}
