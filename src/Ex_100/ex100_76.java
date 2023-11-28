package Ex_100;
import java.util.Scanner;
public class ex100_76 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int n = scanner.nextInt();
	        int k = scanner.nextInt();
	        
	        int result = 1;
	        for (int i = 0; i < k; i++) {
	            result *= n;
	        }
	        
	        System.out.println(result);
	    }

}
