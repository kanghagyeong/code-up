import java.util.Scanner;

public class Main98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length1 = scanner.nextInt();
        int length2 = scanner.nextInt();

        int[][] map = new int[length1][length2];

        int[][] direction = {{0, 1}, {1, 0}};

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            int d = scanner.nextInt();
            int x = scanner.nextInt() -1;
            int y = scanner.nextInt() -1;

            for (int j = 0; j < l; j++) {
                map[x][y] = 1;   
                x += direction[d][0];
                y += direction[d][1];                                                                                                                                                   
            }
        }

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }

}