package Ex_100;
import java.util.Scanner;
public class ex100_60 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] heights = new int[3];
	        for (int i = 0; i < 3; i++) {
	            heights[i] = scanner.nextInt();
	        }

	        boolean crashed = false;
	        for (int height : heights) {
	            if (height <= 170) {
	                System.out.println("CRASH " + height);
	                crashed = true;
	                break;
	            }
	        }

	        if (!crashed) {
	            System.out.println("PASS");
	        }
	    }

}
