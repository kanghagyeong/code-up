import java.util.Scanner;

public class Main62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] num = a.split(" ");

        int num1 = Integer.parseInt(num[0]) ^ Integer.parseInt(num[1]);

        System.out.println(num1);

        scanner.close();

    }
    
}