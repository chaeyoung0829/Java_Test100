package Ex_100;
import java.util.Scanner;

public class ex100_78 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int result = scanner.nextInt(); // 초기값 입력
	        
	        while (true) {
	            String operator = scanner.next();
	            
	            if (operator.equals("=")) {
	                System.out.println(result);
	                break;
	            }
	            
	            int operand = scanner.nextInt();
	            
	            switch (operator) {
	                case "+":
	                    result += operand;
	                    break;
	                case "-":
	                    result -= operand;
	                    break;
	                case "*":
	                    result *= operand;
	                    break;
	                case "/":
	                    result /= operand;
	                    break;
	            }
	        }
	    }

}
