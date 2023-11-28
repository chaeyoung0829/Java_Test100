package Ex_100;
import java.util.Scanner;

public class ex100_86 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int n = scanner.nextInt();

        // »ï°¢ÇüÀÇ À­ ºÎºÐ Ãâ·Â
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
