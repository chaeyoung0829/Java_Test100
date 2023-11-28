package Ex_100;
import java.util.Scanner;
public class ex100_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int carHeight = 170;
	        int tunnelHeight1, tunnelHeight2, tunnelHeight3;

	        tunnelHeight1 = scanner.nextInt();
	        tunnelHeight2 = scanner.nextInt();
	        tunnelHeight3 = scanner.nextInt();

	        if (tunnelHeight1 >= carHeight) {
	            System.out.println("PASS");
	        } else {
	            System.out.println("CRASH");
	        }

	        if (tunnelHeight2 >= carHeight) {
	            System.out.println("PASS");
	        } else {
	            System.out.println("CRASH");
	        }

	        if (tunnelHeight3 >= carHeight) {
	            System.out.println("PASS");
	        } else {
	            System.out.println("CRASH");
	        }
	}
}
	   
	

	


