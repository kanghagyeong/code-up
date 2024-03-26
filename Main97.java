import java.util.Scanner;

public class Main97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] stone = new int[19][19];

        for (int i = 0; i < 19; i++) {

            String num = scanner.nextLine();
            String[] a = num.split(" ");

            for (int j = 0; j < a.length; j++) {

                int b = Integer.parseInt(a[j]);
                stone[i][j] = b;
            }
        }

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int x = scanner.nextInt() -1;
            int y = scanner.nextInt() -1;

            for (int j = 0; j < stone.length; j++) {
                if (stone[x][j] == 0) {
                    stone[x][j] = 1;
                } else if (stone[x][j] == 1) {
                    stone[x][j] = 0;
                }
            }

            for (int j = 0; j < stone.length; j++) {
                if (stone[j][y] == 0) {
                    stone[j][y] = 1;
                } else if (stone[j][y] == 1) {
                    stone[j][y] = 0;
                }
            }
        }

        for (int i = 0; i < stone.length; i++) {
            for (int j = 0; j < stone.length; j++) {
                System.out.print(stone[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }

}