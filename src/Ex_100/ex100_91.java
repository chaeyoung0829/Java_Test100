package Ex_100;
import java.util.Scanner;

public class ex100_91 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 숫자의 개수
        int[] numbers = new int[n]; // 숫자들을 담을 배열

        // 숫자 입력 받기
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[(i + j) % n] + " ");
            }
            System.out.println();
        }
    }

}
