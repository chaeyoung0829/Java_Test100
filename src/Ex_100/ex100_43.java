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
	            return "영";
	        }
	        String[] unit1 = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
	        String[] unit2 = {"", "십", "백", "천"};
	        String[] unit3 = {"", "만", "억", "조", "경"};

	        StringBuilder result = new StringBuilder();
	        int count = 0;
	        boolean isZero = true; // 0인 자리수를 판별하기 위한 변수

	        while (num > 0) {
	            int temp = num % 10;

	            if (temp != 0) {
	                result.insert(0, unit3[count / 4]);
	                result.insert(0, unit1[temp]);
	                result.insert(0, unit2[count % 4]);
	                isZero = false; // 0이 아닌 숫자가 나왔으므로 false로 설정
	            } else if (count % 4 == 0) {
	                result.insert(0, unit3[count / 4]);
	                isZero = true; // 만, 억, 조 등 단위가 바뀌었으므로 true로 설정
	            } else if (!isZero && (count % 4 != 0)) {
	                isZero = true; // 0이 연속해서 나오고 있으므로 true로 설정하여 해당 자리를 생략
	            }

	            num /= 10;
	            count++;
	        }

	        return result.toString();
	    }

}
