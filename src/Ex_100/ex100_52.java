package Ex_100;
import java.util.Scanner;

public class ex100_52 {

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);
	        
	        int number = scanner.nextInt(); // 1부터 99까지의 숫자 
	        
	        String ordinal = getEnglishOrdinal(number); // 입력된 숫자를 영어 서수로 변환
	        
	        System.out.println(ordinal); 
	        
	        scanner.close();
	    }

	    // 영어 서수 변환 함수
	    private static String getEnglishOrdinal(int number) {
	        if (number >= 11 && number <= 13) {
	            return number + "th"; // 11, 12, 13은 예외 
	        } else if (number % 10 == 1) {
	            return number + "st";
	        } else if (number % 10 == 2) {
	            return number + "nd";
	        } else if (number % 10 == 3) {
	            return number + "rd";
	        } else {
	            return number + "th";
	        }
	    }

}
