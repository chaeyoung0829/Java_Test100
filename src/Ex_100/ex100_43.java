package Ex_100;
import java.util.Scanner;
public class ex100_43 {

    // ���� ����� ���� ����
    static String[] unit = { "", "��", "��", "õ", "��", "�ʸ�", "�鸸", "õ��", "��", "�ʾ�", "���", "õ��" };

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // �Էµ� ���ڸ� ���ڿ� ������ ��ȯ
        String stringNum = Integer.toString(num);

        // ���� ����� ���� ����
        int j = stringNum.length() - 1;

        // ���ڿ��� ���� ��ŭ �ݺ��� ����
        for (int i = 0; i < stringNum.length(); i++) {
            int n = stringNum.charAt(i) - '0';        // ���ڿ��� �ִ� ���ڸ� �ϳ��� �����ͼ� int������ ��ȯ
            if (readNum(n) != null) {    // ���ڰ� 0�� ���� ������� ����
                System.out.print(readNum(n));    // ���ڸ� �ѱ۷� �о ���
                System.out.print(unit[j]);        // ���� ���
            }
            j--;
        }
        System.out.println();
    }

  
    public static String readNum(int num) {
        switch (num) {
            case 1:
                return "��";
            case 2:
                return "��";
            case 3:
                return "��";
            case 4:
                return "��";
            case 5:
                return "��";
            case 6:
                return "��";
            case 7:
                return "ĥ";
            case 8:
                return "��";
            case 9:
                return "��";
        }
        return null;
    }

}
