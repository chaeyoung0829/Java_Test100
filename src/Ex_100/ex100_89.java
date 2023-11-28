package Ex_100;
import java.util.Scanner;
public class ex100_89 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int k = scanner.nextInt();

	        for (int i = 1; i <= 6; i++) {
	            for (int j = 1; j <= 6; j++) {
	                if (i + j == k) {
	                    System.out.println(i + " " + j);
	                }
	            }
	        }
	    }

}
