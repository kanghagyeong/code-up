import java.util.Scanner;

public class Main57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        String[] num = a.split(" ");

        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);

        if (num1 == num2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();

    }
    
}