package Ex_100;
import java.util.Scanner;
public class ex100_45 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	       
	        double a = scanner.nextDouble();
	        double b = scanner.nextDouble();
	        double c = scanner.nextDouble();

	        double discriminant = b * b - 4 * a * c; // 판별식 계산

	        if (discriminant > 0) { // 실근 두 개
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.printf("방정식의 해는 %.2f\n",root1);
	            System.out.printf("방정식의 해는 %.2f\n",root2);
	        } else if (discriminant == 0) { // 중근
	            double root = -b / (2 * a);
	            System.out.printf("%.2f", root);
	        } else { // 허근
	            System.out.println("실근이 없습니다.");
	        }

	}

}
