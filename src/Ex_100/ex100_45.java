package Ex_100;
import java.util.Scanner;
public class ex100_45 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	       
	        double a = scanner.nextDouble();
	        double b = scanner.nextDouble();
	        double c = scanner.nextDouble();

	        double discriminant = b * b - 4 * a * c; // �Ǻ��� ���

	        if (discriminant > 0) { // �Ǳ� �� ��
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.printf("�������� �ش� %.2f\n",root1);
	            System.out.printf("�������� �ش� %.2f\n",root2);
	        } else if (discriminant == 0) { // �߱�
	            double root = -b / (2 * a);
	            System.out.printf("%.2f", root);
	        } else { // ���
	            System.out.println("�Ǳ��� �����ϴ�.");
	        }

	}

}
