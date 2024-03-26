import java.util.Scanner;

public class Main99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] maze = new int[10][10];
        int x = 1;
        int y = 1;

        int[][] direction = {{0, 1}, {1, 0}};

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        if (maze[x][y] == 2) {
            maze[x][y] = 9;
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze.length; j++) {
                    System.out.print(maze[i][j] + " ");
                }
                System.out.println();
            }
    
            scanner.close();
            return;
        }

        maze[x][y] = 9;

        while (true) {
            
            if (maze[x][y + 1]!= 1) {
                x += direction[0][0];
                y += direction[0][1];
            } else {
                x += direction[1][0];
                y += direction[1][1];
            }
            if ((x == 9 && y == 9)) {
                break;
            }
            if (maze[x][y+1] == 1 && maze[x+1][y] == 1) {
                maze[x][y] = 9;
                break;
            }

            if (maze[x][y] == 2) {
                maze[x][y] = 9;
                break;
            }

            maze[x][y] = 9;
        }

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }

}