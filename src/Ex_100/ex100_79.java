package Ex_100;
import java.util.Scanner;

public class ex100_79 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        StringBuilder result = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                result.append(Character.toLowerCase(ch));
	            } else if (Character.isLowerCase(ch)) {
	                result.append(Character.toUpperCase(ch));
	            } else {
	                result.append(ch);
	            }
	        }

	        System.out.println(result);
	    }

}
