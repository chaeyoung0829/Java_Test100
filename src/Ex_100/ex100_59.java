package Ex_100;
import java.util.Scanner;
public class ex100_59 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // ��÷ ��ȣ �Է�
	        int[] winningNumbers = new int[6];
	        for (int i = 0; i < 6; i++) {
	            winningNumbers[i] = scanner.nextInt();
	        }
	        int bonusNumber = scanner.nextInt();

	        // ������ �ζ� ��ȣ �Է�
	        int[] playerNumbers = new int[6];
	        for (int i = 0; i < 6; i++) {
	            playerNumbers[i] = scanner.nextInt();
	        }

	        int matched = countMatchedNumbers(winningNumbers, playerNumbers);
	        boolean bonusMatched = isBonusMatched(bonusNumber, playerNumbers);

	        if (matched == 6) {
	            System.out.println("1");
	        } else if (matched == 5 && bonusMatched) {
	            System.out.println("2");
	        } else if (matched == 5) {
	            System.out.println("3");
	        } else if (matched == 4) {
	            System.out.println("4");
	        } else if (matched == 3) {
	            System.out.println("5");
	        } else {
	            System.out.println("0 ��!");
	        }
	    }

	    // ���� ��ȣ ���� ���� �Լ�
	    private static int countMatchedNumbers(int[] arr1, int[] arr2) {
	        int count = 0;
	        for (int num1 : arr1) {
	            for (int num2 : arr2) {
	                if (num1 == num2) {
	                    count++;
	                    break;
	                }
	            }
	        }
	        return count;
	    }

	    // ���ʽ� ��ȣ ��ġ Ȯ���ϴ� �Լ�
	    private static boolean isBonusMatched(int bonusNumber, int[] playerNumbers) {
	        for (int num : playerNumbers) {
	            if (num == bonusNumber) {
	                return true;
	            }
	        }
	        return false;
	    }

}
