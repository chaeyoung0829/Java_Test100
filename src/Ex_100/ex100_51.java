package Ex_100;
import java.util.Scanner;
public class ex100_51 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); 

        int compressedValue = compressTrash(n); 
        
        System.out.println(compressedValue); 

        if (compressedValue <= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("OH MY GOD");
        }
        
        scanner.close();
    }

  //알고리즘 함수
    private static int compressTrash(int n) {
       
        int result = ((n % 10) * 10 + (n / 10)) * 2;
        
      
        if (result > 99) {
            result %= 100;
        }
        
        return result;
    }

}


