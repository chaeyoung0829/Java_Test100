package Ex_100;
import java.util.Scanner;
public class ex100_90 {
	
	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        int count = scanner.nextInt(); // 호출 횟수
	        int[] numbers = new int[count - 1]; // 호출 횟수에서 1을 뺀 크기의 배열

	        // 번호 입력 받기
	        for (int i = 0; i < count - 1; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // 거꾸로 출력
	        for (int i = count - 2; i >= 0; i--) {
	            System.out.print(numbers[i] + " ");
	        }
	        System.out.println(count); // 호출 횟수 출력
	    }
	}


