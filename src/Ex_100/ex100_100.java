package Ex_100;
import java.util.Scanner;
import java.util.Random;

public class ex100_100 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computerNumber = random.nextInt(100) + 1; // 1���� 100������ ���� ���� ����
        int userGuess;

     

        do {
            System.out.print("��ȣ�� �Է��ϼ���");
            userGuess = scanner.nextInt();

            if (userGuess > computerNumber) {
                System.out.println("��ȣ�� ���亸�� �۽��ϴ�.");
            } else if (userGuess < computerNumber) {
                System.out.println("��ȣ�� ���亸�� Ů�ϴ�.");
            } else {
                System.out.println("�����Դϴ�.");
            }
        } while (userGuess != computerNumber);
    }

}
