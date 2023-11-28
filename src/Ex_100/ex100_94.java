package Ex_100;
import java.util.Scanner;
public class ex100_94 {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String brackets = scanner.nextLine();

	        int openCount = 0;
	        int closeCount = 0;

	        for (char bracket : brackets.toCharArray()) {
	            if (bracket == '(') {
	                openCount++;
	            } else if (bracket == ')') {
	                closeCount++;
	            }
	        }

	        System.out.println(openCount + " " + closeCount);
	    }
}