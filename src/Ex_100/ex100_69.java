package Ex_100;
import java.util.Scanner;

public class ex100_69 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int a = scanner.nextInt(); // 시작 값
	        int d = scanner.nextInt(); // 등차 값
	        int n = scanner.nextInt(); // 몇 번째 수

	        int result = a + (n - 1) * d; // 등차수열의 n번째 항

	        System.out.println(result);
	    }

}

