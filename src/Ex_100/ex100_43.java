package Ex_100;
import java.util.Scanner;

public class ex100_43 {

	public class KoreanNumber {

	    static String[] units = {"", "½Ê", "¹é", "Ãµ", "¸¸"};

	    static String[] numbers = {"", "ÀÏ", "ÀÌ", "»ï", "»ç", "¿À", "À°", "Ä¥", "ÆÈ", "±¸"};

	    static String convertToKorean(int num) {
	        StringBuilder result = new StringBuilder();
	        String numStr = Integer.toString(num);

	        int len = numStr.length();

	        for (int i = 0; i < len; i++) {
	            int digit = numStr.charAt(i) - '0';

	            if (digit != 0) {
	                result.append(numbers[digit]).append(units[len - i - 1]);
	            } else {
	                // 0ÀÎ °æ¿ì
	                if (i != len - 1 && numStr.charAt(i + 1) != '0') {
	                    result.append(numbers[digit]);
	                }
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int input = scanner.nextInt();
	        String koreanNumber = convertToKorean(input);

	        System.out.println(koreanNumber);
	    }
	}
}