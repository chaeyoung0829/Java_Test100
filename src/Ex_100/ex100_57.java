package Ex_100;
import java.util.Scanner;
public class ex100_57 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] calories = {400, 340, 170, 100, 70};

        int firstMenu = scanner.nextInt();
        int secondMenu = scanner.nextInt();

        int totalCalories = calories[firstMenu - 1] + calories[secondMenu - 1];

        if (totalCalories > 500) {
            System.out.println("angry");
        } else {
            System.out.println("no angry");
        }
    }

}
