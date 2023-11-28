package Ex_100;
import java.util.Scanner;
public class ex100_56 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] yutStatus = new int[5];
	        int countFlipped = 0;

	        for (int i = 0; i < 4; i++) {
	            yutStatus[i] = scanner.nextInt();
	            if (yutStatus[i] == 1) {
	                countFlipped++;
	            }
	        }

	        switch (countFlipped) {
	            case 0:
	                System.out.println("¸ð");
	                break;
	            case 1:
	                System.out.println("µµ");
	                break;
	            case 2:
	                System.out.println("°³");
	                break;
	            case 3:
	                System.out.println("°É");
	                break;
	            case 4:
	                System.out.println("À·");
	                break;
	        }
	    }
}
