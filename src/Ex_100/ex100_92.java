package Ex_100;
import java.util.Scanner;

public class ex100_92 {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 숫자 입력받기
	        int[] numbers = new int[10];
	        for (int i = 0; i < 10; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // 시간 대기
	        try {
	            Thread.sleep(5000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // 숫자 지우기
	        for (int i = 0; i < 50; i++) {
	            System.out.println(); 
	        }

	        // k번째 숫자 찾기
	        int k = scanner.nextInt();
	        System.out.println(numbers[k - 1]); // k번째 숫자 출력
	    }

}
