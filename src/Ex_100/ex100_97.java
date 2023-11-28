package Ex_100;
import java.util.Scanner;
import java.util.*;

public class ex100_97 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // �л� ��
        int C = scanner.nextInt(); // �� �ٿ� ���� �� �ִ� �ڸ� ��
        scanner.nextLine(); 

        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }

        // �л����� Ű ������� ����
        Arrays.sort(heights);

        // �ڸ� ��ġ
        int currentRow = 0;
        for (int i = 0; i < N; i++) {
            System.out.print(heights[i] + " ");
            if ((i + 1) % C == 0) {
                System.out.println(); 
            }
        }
    }

}
