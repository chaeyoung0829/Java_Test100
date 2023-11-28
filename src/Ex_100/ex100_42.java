package Ex_100;
import java.util.Scanner;
public class ex100_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner scanner = new Scanner(System.in);
	         int ballPosition = scanner.nextInt();

	        if ((ballPosition >= 50 && ballPosition <= 70) || (ballPosition % 6 == 0)) {
	            System.out.println("win");
	        } else {
	            System.out.println("lose");
	        }

	}

}
