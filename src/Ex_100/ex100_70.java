package Ex_100;
import java.util.Scanner;

public class ex100_70 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int a = scanner.nextInt(); // ���� ��
	        int r = scanner.nextInt(); // ���� ��
	        int n = scanner.nextInt(); // �� ��° ��

	        int result = a * (int)Math.pow(r, n - 1); // �������� n��° ����

	        System.out.println(result);
	    }

}
