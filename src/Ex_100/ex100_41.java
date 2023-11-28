package Ex_100;
import java.util.Scanner;
public class ex100_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int ballPosition = scanner.nextInt();

        if ((ballPosition >= 30 && ballPosition <= 40) || (ballPosition >= 60 && ballPosition <= 70)) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
	}

}
