package Ex_100;
import java.util.Scanner;
public class ex100_82 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }

}
