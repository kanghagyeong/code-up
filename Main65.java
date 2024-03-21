import java.util.Scanner;

public class Main65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] temp = a.split(" ");

        int num1 = Integer.parseInt(temp[0]);
        int num2 = Integer.parseInt(temp[1]);
        int num3 = Integer.parseInt(temp[2]);

        if (num1 % 2 == 0) {
            System.out.println(num1);
        }
        if (num2 % 2 == 0) {
            System.out.println(num2);
        }
        if (num3 % 2 == 0) {
            System.out.println(num3);
        }
        

        scanner.close();

    }
    
}