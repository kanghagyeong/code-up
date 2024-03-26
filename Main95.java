import java.util.Scanner;

public class Main95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        
        int[] num = new int[10001];

        int min = 24;

        for (int i = 0; i < count; i++) {
            int randomNum = scanner.nextInt();
            num[i] = randomNum;

            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println(min);
        scanner.close();

    }

}