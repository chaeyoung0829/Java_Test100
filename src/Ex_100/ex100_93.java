package Ex_100;
import java.util.Scanner;
public class ex100_93 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 단어 입력받기
        String[] words = new String[7];
        for (int i = 0; i < 7; i++) {
            words[i] = scanner.next();
        }

        // 시간 대기
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 단어 지우기
        for (int i = 0; i < 50; i++) {
            System.out.println(); 
        }

        // k번째 단어 찾기
        int k = scanner.nextInt();
        System.out.println(words[k - 1]); // k번째 단어 출력
    }

}