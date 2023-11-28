package Ex_100;
import java.util.Scanner;
import java.util.*;

public class ex100_96 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int n = Integer.parseInt(scanner.nextLine());

String[] names = new String[n];
int[] scores = new int[n];

for (int i = 0; i < n; i++) {
    names[i] = scanner.nextLine();
    scores[i] = Integer.parseInt(scanner.nextLine());
}

for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (scores[j] < scores[j + 1]) {
            int tempScore = scores[j];
            scores[j] = scores[j + 1];
            scores[j + 1] = tempScore;

            String tempName = names[j];
            names[j] = names[j + 1];
            names[j + 1] = tempName;
        }
    }
}

if (n >= 3) {
    System.out.println(names[2]);
} else {
    System.out.println("3명 미만입니다.");
}
}

}
