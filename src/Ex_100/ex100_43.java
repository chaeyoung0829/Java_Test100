package Ex_100;
import java.util.Scanner;
public class ex100_43 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int number = scanner.nextInt();

	        String result = convertToKorean(number);
	        System.out.println(result);

	        scanner.close();
	    }

	    public static String convertToKorean(int num) {
	        if (num == 0) {
	            return "��";
	        }
	        String[] unit1 = {"", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
	        String[] unit2 = {"", "��", "��", "õ"};
	        String[] unit3 = {"", "��", "��", "��", "��"};

	        StringBuilder result = new StringBuilder();
	        int count = 0;
	        boolean isZero = true; // 0�� �ڸ����� �Ǻ��ϱ� ���� ����

	        while (num > 0) {
	            int temp = num % 10;

	            if (temp != 0) {
	                result.insert(0, unit3[count / 4]);
	                result.insert(0, unit1[temp]);
	                result.insert(0, unit2[count % 4]);
	                isZero = false; // 0�� �ƴ� ���ڰ� �������Ƿ� false�� ����
	            } else if (count % 4 == 0) {
	                result.insert(0, unit3[count / 4]);
	                isZero = true; // ��, ��, �� �� ������ �ٲ�����Ƿ� true�� ����
	            } else if (!isZero && (count % 4 != 0)) {
	                isZero = true; // 0�� �����ؼ� ������ �����Ƿ� true�� �����Ͽ� �ش� �ڸ��� ����
	            }

	            num /= 10;
	            count++;
	        }

	        return result.toString();
	    }

}
