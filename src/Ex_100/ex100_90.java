package Ex_100;
import java.util.Scanner;
public class ex100_90 {
	
	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        int count = scanner.nextInt(); // ȣ�� Ƚ��
	        int[] numbers = new int[count - 1]; // ȣ�� Ƚ������ 1�� �� ũ���� �迭

	        // ��ȣ �Է� �ޱ�
	        for (int i = 0; i < count - 1; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // �Ųٷ� ���
	        for (int i = count - 2; i >= 0; i--) {
	            System.out.print(numbers[i] + " ");
	        }
	        System.out.println(count); // ȣ�� Ƚ�� ���
	    }
	}


