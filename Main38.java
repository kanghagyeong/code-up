import java.util.Scanner;

public class Main38 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] temp = a.split(" ");

        Long result = Long.parseLong(temp[0]) + Long.parseLong(temp[1]);

        scanner.close();

        System.out.println(result);
        
    }
}
