import java.util.Scanner;

public class Main73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int n = scanner.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            
            System.out.println(number[i]);
        }

        scanner.close();
     
    }

}