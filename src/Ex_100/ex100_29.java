package Ex_100;
import java.util.Scanner;
public class ex100_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();

	        System.out.println("a: " + (a % 2 == 0 ? "odd" : "even"));
	        System.out.println("b: " + (b % 2 == 0 ? "odd" : "even"));
	        System.out.println("c: " +(c % 2 == 0 ? "odd" : "even"));

	}

}
