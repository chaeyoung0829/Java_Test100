package Ex_100;
import java.util.Scanner;
public class ex100_75 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        boolean isPrime = true;
        
        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}
