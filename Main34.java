import java.util.Scanner;

public class Main34 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.nextLine();
        int temp = Integer.valueOf(a, 8);

        scanner.close();
        System.out.println(temp);
        
    }
}
