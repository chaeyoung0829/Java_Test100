package Ex_100;
import java.util.Scanner;

public class ex100_77 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        
	        int result = factorial(n);
	        System.out.println(result);
	    }
	    
	    public static int factorial(int n) {
	        if (n <= 1) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }

}
