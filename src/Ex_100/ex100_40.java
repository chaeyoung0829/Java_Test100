package Ex_100;
import java.util.Scanner;
public class ex100_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        double ballPosition = scanner.nextDouble();

	        if (ballPosition >= 50 && ballPosition <= 60) {
	            System.out.println("win");
	        } else {
	            System.out.println("lose");
	        }

	}

}
