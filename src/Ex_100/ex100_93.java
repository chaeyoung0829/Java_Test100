package Ex_100;
import java.util.Scanner;
public class ex100_93 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // �ܾ� �Է¹ޱ�
        String[] words = new String[7];
        for (int i = 0; i < 7; i++) {
            words[i] = scanner.next();
        }

        // �ð� ���
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // �ܾ� �����
        for (int i = 0; i < 50; i++) {
            System.out.println(); 
        }

        // k��° �ܾ� ã��
        int k = scanner.nextInt();
        System.out.println(words[k - 1]); // k��° �ܾ� ���
    }

}