package Ex_100;
import java.util.Scanner;
public class ex100_61 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int operand1 = scanner.nextInt();
	        char operator = scanner.next().charAt(0);
	        int operand2 = scanner.nextInt();

	        double result = 0;

	        switch (operator) {
	            case '+':
	                result = operand1 + operand2;
	                break;
	            case '-':
	                result = operand1 - operand2;
	                break;
	            case '*':
	                result = operand1 * operand2;
	                break;
	            case '/':
	                if (operand2 != 0) {
	                    result = (double) operand1 / operand2;
	                } else {
	                    System.out.println("Error: Division by zero");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid operator");
	                return;
	        }

	        if (operator == '/') {
	            System.out.printf("%.2f\n", result);
	        } else {
	            System.out.println((int) result);
	        }
	    }

}
