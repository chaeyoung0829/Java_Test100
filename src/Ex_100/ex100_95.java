package Ex_100;
import java.util.Scanner;
public class ex100_95 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String sentence = scanner.nextLine().toLowerCase(); // ������ ��� �ҹ��ڷ� ��ȯ�Ͽ� ó���մϴ�.

	        int[] alphabetCount = new int[26]; // ���ĺ� ������ ������ �迭 ����

	        for (char c : sentence.toCharArray()) {
	            if (Character.isLetter(c)) { // ���ĺ��� ��쿡�� ���� ����
	                int index = c - 'a'; // ���ĺ��� �迭�� �ε����� �����մϴ�.
	                alphabetCount[index]++;
	            }
	        }

	        for (int i = 0; i < 26; i++) {
	            char alphabet = (char) ('a' + i);
	            System.out.println(alphabet + ":" + alphabetCount[i]);
	        }
	    }

}
