import java.util.Scanner;

public class Main90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] num = a.split(" ");

        long start = Integer.parseInt(num[0]);
        long degree = Integer.parseInt(num[1]);
        long count = Integer.parseInt(num[2]);

        for (long i = 1; i < count; i++) {
           start *= degree;
        }

        System.out.println(start);
        scanner.close();

    }

}