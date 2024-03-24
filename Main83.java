import java.util.Scanner;

public class Main83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int i = 1; i <=a; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.print("X" +" ");
            } else {
                System.out.print(i + " ");
            }
            
        }
        scanner.close();

    }

}