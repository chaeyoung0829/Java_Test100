package Ex_100;
import java.util.Scanner;
public class ex100_65 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        int num = scanner.nextInt();

	        // 1���� �Էµ� ������ �ݺ��ϸ� ���
	        for (int i = 1; i <= num; i++) {
	            if (i % 3 == 0) {
	                System.out.print("X ");
	            } else {
	                System.out.print(i + " ");
	            }
	        }
	    }

}
