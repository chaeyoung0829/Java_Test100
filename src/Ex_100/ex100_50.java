package Ex_100;
import java.util.Scanner;
public class ex100_50 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double bmi = scanner.nextDouble();
        String result = checkObesity(bmi);
        System.out.println(result);
    }

    // BMI ��ġ�� ���� �� ���� �����ϴ� �Լ�
    private static String checkObesity(double bmi) {
        if (bmi < 18.5) {
            return "��ü��";
        } else if (bmi >= 18.5 && bmi <= 23) {
            return "����ü��";
        } else {
            return "��ü��";
        }
    }

}


