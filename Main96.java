import java.util.Scanner;

public class Main96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();

        int[][] stone = new int[19][19];

        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            stone[x-1][y-1] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(stone[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();

    }

}