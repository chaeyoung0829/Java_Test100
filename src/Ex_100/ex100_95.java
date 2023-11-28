package Ex_100;
import java.util.Scanner;
public class ex100_95 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String sentence = scanner.nextLine().toLowerCase(); // 문장을 모두 소문자로 변환하여 처리합니다.

	        int[] alphabetCount = new int[26]; // 알파벳 개수를 저장할 배열 생성

	        for (char c : sentence.toCharArray()) {
	            if (Character.isLetter(c)) { // 알파벳인 경우에만 개수 세기
	                int index = c - 'a'; // 알파벳을 배열의 인덱스에 매핑합니다.
	                alphabetCount[index]++;
	            }
	        }

	        for (int i = 0; i < 26; i++) {
	            char alphabet = (char) ('a' + i);
	            System.out.println(alphabet + ":" + alphabetCount[i]);
	        }
	    }

}
