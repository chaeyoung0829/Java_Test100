package Ex_100;
import java.util.Scanner;
public class ex100_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

       
        String sign = (number < 0) ? "minus" : "plus";
        String parity = (number % 2 == 0) ? "even" : "odd";

        System.out.println("ºÎÈ£: " + sign);
        System.out.println("È¦Â¦: " + parity);


	}

}
