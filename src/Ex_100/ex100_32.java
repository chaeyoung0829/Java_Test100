package Ex_100;
import java.util.Scanner;
public class ex100_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        char grade = scanner.next().charAt(0);

	       
	        switch (grade) {
	            case 'A':
	                System.out.println("best!!!");
	                break;
	            case 'B':
	                System.out.println("good!!");
	                break;
	            case 'C':
	                System.out.println("run!");
	                break;
	            case 'D':
	                System.out.println("slowly~");
	                break;
	            default:
	                System.out.println("what?");
	        }

	}

}
