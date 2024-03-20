import java.util.Scanner;

public class Main48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] cal = a.split(" ");

        int multiply = Integer.parseInt(cal[0]) << Integer.parseInt(cal[1]);
        scanner.close();

        System.out.println(multiply);
    }
    
}