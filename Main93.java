import java.util.Scanner;

public class Main93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        
        int[] random = new int[23];


        for (int i = 0; i < count; i++) {
            int randomNum = scanner.nextInt();
            random[randomNum - 1] ++;
        }


        for (int i = 0; i < 23; i++) {
            System.out.print(random[i] + " ");
        }

        scanner.close();

    }

}