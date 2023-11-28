package Ex_100;
import java.util.Scanner;
public class ex100_66 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = scanner.nextInt();
        int sum = 0;
        int num = 1;

        while (sum <= target) {
            sum += num;
            num++;
        }

        System.out.println(sum);
    }
	

}
