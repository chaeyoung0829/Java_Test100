package Ex_100;
import java.util.Scanner;
public class ex100_62 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int grade = scanner.nextInt();
	        int classNum = scanner.nextInt();
	        int number = scanner.nextInt();

	       
	        String formattedGrade = String.format("%d", grade);
	        String formattedClass = String.format("%02d", classNum);
	        String formattedNumber = String.format("%03d", number);

	       
	        System.out.println(formattedGrade + formattedClass + formattedNumber);
	    }
	}


