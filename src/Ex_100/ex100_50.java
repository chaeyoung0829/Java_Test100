package Ex_100;
import java.util.Scanner;
public class ex100_50 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double bmi = scanner.nextDouble();
        String result = checkObesity(bmi);
        System.out.println(result);
    }

    // BMI 수치에 따라 비만 여부 판정하는 함수
    private static String checkObesity(double bmi) {
        if (bmi < 18.5) {
            return "저체중";
        } else if (bmi >= 18.5 && bmi <= 23) {
            return "정상체중";
        } else {
            return "과체중";
        }
    }

}


