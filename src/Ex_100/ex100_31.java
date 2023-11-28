package Ex_100;
import java.util.Scanner;
public class ex100_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        // 평가 기준에 따라 등급 출력
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 70 && score <= 89) {
            System.out.println("B");
        } else if (score >= 40 && score <= 69) {
            System.out.println("C");
        } else if (score >= 0 && score <= 39) {
            System.out.println("D");
        } else {
            System.out.println("0부터 100 사이의 값을 입력하세요.");
        }

	}

}
