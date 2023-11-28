package Ex_100;
import java.util.Scanner;
public class ex100_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        // À±³â ¿©ºÎ ÆÇ´Ü
        if (isLeapYear(year)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // À±³â
        } else {
            return false; // À±³â ¾Æ´Ô
        }
    }

}


