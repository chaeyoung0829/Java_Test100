package Ex_100;
import java.util.*;

public class ex100_98 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt(); // ���� ����
	        scanner.nextLine();

	        int[][] board = new int[10][10]; // �ٵ��� ����

	        // �� ��ǥ �Է� �޾Ƽ� �ٵ��ǿ� ǥ��
	        for (int i = 0; i < n; i++) {
	            int x = scanner.nextInt(); // X ��ǥ
	            int y = scanner.nextInt(); // Y ��ǥ
	            scanner.nextLine(); 

	            board[x - 1][y - 1] = 1; // �� ǥ��
	        }

	        // �ٵ��� ���
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
