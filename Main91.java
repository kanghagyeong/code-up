import java.util.Scanner;

public class Main91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] num = a.split(" ");

        long start = Integer.parseInt(num[0]);
        long multiply = Integer.parseInt(num[1]);
        long plus = Integer.parseInt(num[2]);
        long count = Integer.parseInt(num[3]);

        for (int i = 1; i < count; i++) {
            start *= multiply;

            start += plus;

        }

        System.out.println(start);
        scanner.close();

    }

}