import java.util.Scanner;

public class Main27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a;
        a = scanner.nextLine();

        String[] temp = a.split("\\.");

        System.out.println(temp[2] + "-" + temp[1] +"-" + temp[0]);

    }

}