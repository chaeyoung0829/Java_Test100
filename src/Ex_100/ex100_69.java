package Ex_100;
import java.util.Scanner;

public class ex100_69 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int a = scanner.nextInt(); // ���� ��
	        int d = scanner.nextInt(); // ���� ��
	        int n = scanner.nextInt(); // �� ��° ��

	        int result = a + (n - 1) * d; // ���������� n��° ��

	        System.out.println(result);
	    }

}

