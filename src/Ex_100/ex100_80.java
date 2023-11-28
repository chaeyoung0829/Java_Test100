package Ex_100;
import java.util.Scanner;

public class ex100_80 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cipherText = scanner.nextLine();

        StringBuilder plainText = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i++) {
            char currentChar = cipherText.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                char decryptedChar = (char) (((currentChar - 'a' - 3 + 26) % 26) + 'a');
                plainText.append(decryptedChar);
            } else if (Character.isUpperCase(currentChar)) {
                char decryptedChar = (char) (((currentChar - 'A' - 3 + 26) % 26) + 'A');
                plainText.append(decryptedChar);
            } else {
                plainText.append(currentChar);
            }
        }

        System.out.println(plainText);
    }

}
