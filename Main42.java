import java.util.Scanner;

public class Main42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] division = a.split(" ");

        int result = Integer.parseInt(division[0]) / Integer.parseInt(division[1]);

        scanner.close();

        System.out.println(result);
    }
    
}