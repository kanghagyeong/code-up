import java.util.Scanner;

public class Main92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] visit = new int[3];

        for (int i = 0; i < 3; i++) {
            visit[i] = scanner.nextInt();
        }

        int lcm = gcd(visit[0], visit[1]);
        int result = visit[0] * visit[1] / lcm;

        int lcm2 = gcd(result, visit[2]);
        int result2 = result * visit[2] / lcm2;

        System.out.println(result2);

        scanner.close();

    }

    public static int gcd(int a, int b) {

        if (a < b) {
            int temp;
            temp = b;
            b = a;
            a = temp;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;

    }

}