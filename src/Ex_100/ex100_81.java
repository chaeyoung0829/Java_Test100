package Ex_100;
import java.util.Scanner;
public class ex100_81 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // 5개의 정수 입력 받기
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        // 최댓값, 최솟값 찾기
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 결과 출력
        System.out.println(max);
        System.out.println(min);
    }

}
