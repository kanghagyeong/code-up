import java.util.Scanner;

public class Main24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;

        a = scanner.nextLine();

        String[] word = new String[a.length()];

        for (int i = 0; i < a.length(); i++) {
            System.out.println("'" + a.charAt(i) + "'");
        }

    }

}