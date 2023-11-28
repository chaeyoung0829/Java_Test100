package Ex_100;
import java.util.Scanner;
public class ex100_53 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double a = scanner.nextDouble();
	        double b = scanner.nextDouble();

	        double sum = a + b;
	        double subtract = Math.abs(a - b); // 절대값 함수 사용
	        double multiply = a * b;
	        double divide = (b != 0) ? a / b : 0; // 0으로 나누는 경우를 방지
	        double power_a = Math.pow(a, b);
	        double power_b = Math.pow(b, a);

	        double max_value = sum;
	        if (subtract > max_value) max_value = subtract;
	        if (multiply > max_value) max_value = multiply;
	        if (divide > max_value) max_value = divide;
	        if (power_a > max_value) max_value = power_a;
	        if (power_b > max_value) max_value = power_b;

	        System.out.printf("%.6f\n", max_value);
	    }

}
