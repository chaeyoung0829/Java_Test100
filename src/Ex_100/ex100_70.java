package Ex_100;
import java.util.Scanner;

public class ex100_70 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int a = scanner.nextInt(); // 시작 값
	        int r = scanner.nextInt(); // 등차 값
	        int n = scanner.nextInt(); // 몇 번째 수

	        int result = a * (int)Math.pow(r, n - 1); // 등비수열의 n번째 항을

	        System.out.println(result);
	    }

}
