import java.util.Scanner;

public class Main81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dice = scanner.nextLine();
        String[] diceFace = dice.split(" ");

        int a = Integer.parseInt(diceFace[0]);
        int b = Integer.parseInt(diceFace[1]);


        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.println(i + " " + j);
            }
        }

        scanner.close();

    }

}