package Ex_100;
import java.util.Scanner;
public class ex100_39 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int minNumber = Math.min(Math.min(num1, num2), num3);

        System.out.println(minNumber);

	}

}
