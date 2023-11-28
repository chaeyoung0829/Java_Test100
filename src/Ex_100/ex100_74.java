package Ex_100;
import java.util.Scanner;
public class ex100_74 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int N = scanner.nextInt();
	        
	        // 1부터 N까지 모든 수에 대해 약수인지 확인
	        for (int i = 1; i <= N; i++) {
	            if (N % i == 0) {
	                System.out.print(i + " "); // 약수 출력
	            }
	        }
	    }

}
