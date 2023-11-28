package Ex_100;
import java.util.Scanner;
public class ex100_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
        int b = scanner.nextInt();
        int maxNumber = (a > b) ? a : b;
        System.out.println( maxNumber);

	}

}
