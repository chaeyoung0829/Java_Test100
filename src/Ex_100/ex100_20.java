package Ex_100;
import java.util.Scanner;

public class ex100_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		int sum=x+y+z;
		float mean=sum/3;
		
		System.out.printf("%d\n%.1f", sum, mean);

	}

}
