import java.util.Scanner;

public class Main82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int num = Integer.valueOf(a, 16);

        int result = 1;

        for (int i = 1; i <= 15; i++) {

            result = num * i;

            System.out.printf("%X*%X=%X\n", num, i, result);

        }

        scanner.close();

    }

}