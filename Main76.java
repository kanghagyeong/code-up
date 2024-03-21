import java.util.Scanner;

public class Main76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char n = scanner.nextLine().charAt(0);
        
        int num = (int)n;

        for (int i = 97; i <= num ; i++) {

            System.out.print((char)i + " ");
        }
        System.out.println();
        scanner.close();
     
    }

}