import java.util.Scanner;

public class Main25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i;

        i = scanner.nextInt();

        int a = (i / 10000) * 10000;
        int b = (i % 10000) / 1000 * 1000;
        int c = (i % 10000) % 1000 / 100 * 100;
        int d = (i % 10000) % 1000 % 100 / 10 *10;
        int e = i % 10;

        System.out.println("[" + a + "]\n" + "[" +  b + "]\n" + "[" + c +  "]\n" + "[" +  d + "]\n" + "[" +  e + "]\n");

        scanner.close();

    }

}