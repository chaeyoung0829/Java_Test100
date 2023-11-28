package Ex_100;
import java.util.Scanner;
public class ex100_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int number = scanner.nextInt();

	        int sum = 0;
	        for (int i = 2; i <= number; i += 2) {
	            sum += i;
	        }

	        // 결과 출력
	        System.out.println(sum);


	}

}
