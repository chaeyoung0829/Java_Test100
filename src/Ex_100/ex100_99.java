package Ex_100;
import java.util.Scanner;
public class ex100_99 {
	 static void calculateGrade(int score) {
	        if (score >= 90) {
	            System.out.println("A����");
	        } else if (score >= 80) {
	            System.out.println("B����");
	        } else if (score >= 70) {
	            System.out.println("C����");
	        } else if (score >= 60) {
	            System.out.println("D����");
	        } else {
	            System.out.println("E����");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int inputScore = scanner.nextInt(); 
	        calculateGrade(inputScore); 
	    }

}
