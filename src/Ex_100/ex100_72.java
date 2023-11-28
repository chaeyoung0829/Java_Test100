package Ex_100;
import java.util.Scanner;

public class ex100_72 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt(); // 정수의 개수 입력
	        int max = Integer.MIN_VALUE; 

	        for (int i = 0; i < n; i++) {
	            int num = scanner.nextInt(); 
	            max = Math.max(max, num); 
	        }

	        System.out.println(max); 
	    }

}
