import java.util.Scanner;

public class Main23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        a = scanner.next();

        String[] temp = a.split("\\.");

        System.out.println(temp[0]);
        System.out.println(temp[1]);
    }

}