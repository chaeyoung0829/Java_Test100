package Ex_100;
import java.util.Scanner;
public class ex100_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        // �� ���ؿ� ���� ��� ���
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 70 && score <= 89) {
            System.out.println("B");
        } else if (score >= 40 && score <= 69) {
            System.out.println("C");
        } else if (score >= 0 && score <= 39) {
            System.out.println("D");
        } else {
            System.out.println("0���� 100 ������ ���� �Է��ϼ���.");
        }

	}

}
