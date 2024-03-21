import java.util.Scanner;

public class Main68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextInt();

        if (grade > 89) {
            System.out.println("A");
        } else if (grade > 69 ) {
            System.out.println("B");
        } else if (grade > 39) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        scanner.close();

    }
    
}