package Ex_100;
import java.util.Scanner;
import java.util.Random;

public class ex100_100 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computerNumber = random.nextInt(100) + 1; // 1부터 100까지의 랜덤 숫자 생성
        int userGuess;

     

        do {
            System.out.print("번호를 입력하세요");
            userGuess = scanner.nextInt();

            if (userGuess > computerNumber) {
                System.out.println("번호가 정답보다 작습니다.");
            } else if (userGuess < computerNumber) {
                System.out.println("번호가 정답보다 큽니다.");
            } else {
                System.out.println("정답입니다.");
            }
        } while (userGuess != computerNumber);
    }

}
