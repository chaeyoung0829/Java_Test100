package Ex_100;
import java.util.Scanner;
public class ex100_49 {
	  public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     int hour = scanner.nextInt();
     int minute = scanner.nextInt();

     int[] result = calculateTimeBackward(hour, minute);

     System.out.println(result[0] + " " + result[1]);
}

 private static int[] calculateTimeBackward(int hour, int minute) {
     int[] result = new int[2];

     if (minute >= 30) {
         result[0] = hour;
         result[1] = minute - 30;
     } else {
         if (hour == 0) {
             result[0] = 23;
         } else {
             result[0] = hour - 1;
         }
         result[1] = minute + 30;
     }

     return result;
 }

}
