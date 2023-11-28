package Ex_100;
import java.util.Scanner;
public class ex100_58 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
