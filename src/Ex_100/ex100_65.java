package Ex_100;
import java.util.Scanner;
public class ex100_65 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        int num = scanner.nextInt();

	        // 1부터 입력된 수까지 반복하며 출력
	        for (int i = 1; i <= num; i++) {
	            if (i % 3 == 0) {
	                System.out.print("X ");
	            } else {
	                System.out.print(i + " ");
	            }
	        }
	    }

}
