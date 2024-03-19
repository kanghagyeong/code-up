import java.util.Scanner;

public class Main35 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.nextLine();
        int temp = Integer.parseInt(a, 16);
        String num = Integer.toOctalString(temp);

        scanner.close();
        System.out.println(num);
        
    }
}
