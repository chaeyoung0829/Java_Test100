package Ex_100;
import java.util.Scanner;

public class ex100_73 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int h = scanner.nextInt();

        int[] donation = new int[24];

        for (int i = 0; i < 24; i++) {
            donation[i] = (i % 2 == 0 ? (i / 2 + 1) : (i / 2 + 1) * 10);
        }

        int sum = donation[k - 1] + donation[h - 1]; // 존과 밥이 받는 기부금 합

        System.out.println(sum);
    }
	}

