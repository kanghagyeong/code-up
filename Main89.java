import java.util.Scanner;

public class Main89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] num = a.split(" ");

        int start = Integer.parseInt(num[0]);
        int degree = Integer.parseInt(num[1]);
        int count = Integer.parseInt(num[2]);

        for (int i = 1; i < count; i++) {
           start += degree;
        }

        System.out.println(start);
        scanner.close();

    }

}