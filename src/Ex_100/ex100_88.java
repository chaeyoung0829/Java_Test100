package Ex_100;
import java.util.Scanner;
public class ex100_88 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        int sum = 0;
	        int currentSum = 0;

	        for (int i = 1; i <= n; i++) {
	            currentSum += i;
	            sum += currentSum;
	        }

	        System.out.println(sum);
	    }

}
