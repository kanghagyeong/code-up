import java.util.Scanner;

public class Main87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= a; i++) {
            sum += i;

            if (sum >= a) {
                break;
            }

        }
        System.out.println(sum);
        scanner.close();

    }

}