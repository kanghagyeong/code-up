import java.util.Scanner;

public class Main19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        a = scanner.nextLine();

        String[] temp = a.split("\\.");
        
        int year = Integer.parseInt(temp[0]);

        int month = Integer.parseInt(temp[1]);
        int day = Integer.parseInt(temp[2]);

        System.out.printf("%04d.%02d.%02d\n",year, month, day);
        scanner.close();
    }

}