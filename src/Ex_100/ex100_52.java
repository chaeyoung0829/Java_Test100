package Ex_100;
import java.util.Scanner;

public class ex100_52 {

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);
	        
	        int number = scanner.nextInt(); // 1���� 99������ ���� 
	        
	        String ordinal = getEnglishOrdinal(number); // �Էµ� ���ڸ� ���� ������ ��ȯ
	        
	        System.out.println(ordinal); 
	        
	        scanner.close();
	    }

	    // ���� ���� ��ȯ �Լ�
	    private static String getEnglishOrdinal(int number) {
	        if (number >= 11 && number <= 13) {
	            return number + "th"; // 11, 12, 13�� ���� 
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
