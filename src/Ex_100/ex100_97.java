package Ex_100;
import java.util.Scanner;
import java.util.*;

public class ex100_97 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 학생 수
        int C = scanner.nextInt(); // 한 줄에 앉을 수 있는 자리 수
        scanner.nextLine(); 

        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        // 학생들을 키 순서대로 정렬
        Arrays.sort(heights);

        // 자리 배치
        int currentRow = 0;
        for (int i = 0; i < N; i++) {
            System.out.print(heights[i] + " ");
            if ((i + 1) % C == 0) {
                System.out.println(); 
            }
        }
    }

}
