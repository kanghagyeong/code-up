import java.util.Scanner;

public class Main60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = ~a;

        int num = Integer.parseInt(b+"",10);

        System.out.println(num);

        scanner.close();

    }
    
}