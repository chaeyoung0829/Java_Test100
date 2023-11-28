package Ex_100;
import java.util.*;

public class ex100_98 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt(); // Èòµ¹ÀÇ °³¼ö
	        scanner.nextLine();

	        int[][] board = new int[10][10]; // ¹ÙµÏÆÇ »ý¼º

	        // Èòµ¹ ÁÂÇ¥ ÀÔ·Â ¹Þ¾Æ¼­ ¹ÙµÏÆÇ¿¡ Ç¥½Ã
	        for (int i = 0; i < n; i++) {
	            int x = scanner.nextInt(); // X ÁÂÇ¥
	            int y = scanner.nextInt(); // Y ÁÂÇ¥
	            scanner.nextLine(); 

	            board[x - 1][y - 1] = 1; // Èòµ¹ Ç¥½Ã
	        }

	        // ¹ÙµÏÆÇ Ãâ·Â
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
