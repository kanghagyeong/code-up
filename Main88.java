import java.util.Scanner;

public class Main88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int plus = 0;
        
        for (int i = 1; i <= a; i++) {
            plus += 1;
            
            if (plus % 3 == 0) {
                continue;
            }
            
            System.out.print(plus + " ");
        }
        scanner.close();

    }

}