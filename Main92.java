import java.util.Scanner;

public class Main92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] num = a.split(" ");

        int start = Integer.parseInt(num[0]);
        int multiply = Integer.parseInt(num[1]);
        int plus = Integer.parseInt(num[2]);
        int count = Integer.parseInt(num[3]);

        for (int i = 1; i < count; i++) {
            start *= multiply;
            plus += start;
           
        }

        System.out.println(plus);
        scanner.close();

    }

}