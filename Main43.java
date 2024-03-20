import java.util.Scanner;

public class Main43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] remainder = a.split(" ");

        int result = Integer.parseInt(remainder[0]) % Integer.parseInt(remainder[1]);

        scanner.close();

        System.out.println(result);
    }
    
}