package Ex_100;
import java.util.Scanner;

public class ex100_92 {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // ���� �Է¹ޱ�
	        int[] numbers = new int[10];
	        for (int i = 0; i < 10; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // �ð� ���
	        try {
	            Thread.sleep(5000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // ���� �����
	        for (int i = 0; i < 50; i++) {
	            System.out.println(); 
	        }

	        // k��° ���� ã��
	        int k = scanner.nextInt();
	        System.out.println(numbers[k - 1]); // k��° ���� ���
	    }

}
