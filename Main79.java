import java.util.Scanner;

public class Main79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] result = a.split(" ");

        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);

            if (result[i].equals("q")) {
                break;
            }

        }

        scanner.close();

    }

}